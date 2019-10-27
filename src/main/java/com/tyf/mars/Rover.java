package com.tyf.mars;

import org.apache.logging.log4j.util.Strings;

public class Rover {
    Coordinate coordinate;

    public Rover(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setOperate(String operateStr) {
        String[] operates = operateStr.split(" ");
        for ( String opr : operates) {
            executeOperate(opr);
            // System.out.printf("当前小车坐标与方向为：%s \n", this.coordinate.toString());
        }
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    private void executeOperate(String operation){
        switch (operation) {
            case Constants.OPERATE_DIRECT_TURN_LEFT:
                switch (this.coordinate.direct) {
                    case Constants.NORTH :
                        this.coordinate.direct = Constants.WEST;
                        break;
                    case Constants.WEST :
                        this.coordinate.direct = Constants.SOUTH;
                        break;
                    case Constants.SOUTH :
                        this.coordinate.direct = Constants.EAST;
                        break;
                    case Constants.EAST :
                        this.coordinate.direct = Constants.NORTH;
                        break;
                    default:
                        break;
                }
                break;
            case Constants.OPERATE_DIRECT_TURN_RIGHT:
                switch (this.coordinate.direct) {
                    case Constants.NORTH :
                        this.coordinate.direct = Constants.EAST;
                        break;
                    case Constants.WEST :
                        this.coordinate.direct = Constants.NORTH;
                        break;
                    case Constants.SOUTH :
                        this.coordinate.direct = Constants.WEST;
                        break;
                    case Constants.EAST :
                        this.coordinate.direct = Constants.SOUTH;
                        break;
                    default:
                        break;
                }
                break;
            case Constants.OPERATE_DIRECT_GO_FRONT:
                switch (this.coordinate.direct) {
                    case Constants.NORTH :
                        this.coordinate.y = coordinate.y + 1;
                        break;
                    case Constants.WEST :
                        this.coordinate.x = coordinate.x - 1;
                        break;
                    case Constants.SOUTH :
                        this.coordinate.y = coordinate.y - 1;
                        break;
                    case Constants.EAST :
                        this.coordinate.x = coordinate.x + 1;
                        break;
                    default:
                        break;
                }
                break;
            case Constants.OPERATE_DIRECT_GO_BACK:
                switch (this.coordinate.direct) {
                    case Constants.NORTH :
                        this.coordinate.y = coordinate.y - 1;
                        break;
                    case Constants.WEST :
                        this.coordinate.x = coordinate.x + 1;
                        break;
                    case Constants.SOUTH :
                        this.coordinate.y = coordinate.y + 1;
                        break;
                    case Constants.EAST :
                        this.coordinate.x = coordinate.x - 1;
                        break;
                    default:
                        break;
                }
                break;
        }

    }
}
