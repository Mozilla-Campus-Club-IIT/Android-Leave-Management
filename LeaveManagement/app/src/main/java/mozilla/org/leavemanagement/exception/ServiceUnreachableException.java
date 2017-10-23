package mozilla.org.leavemanagement.exception;

import java.io.IOException;


public class ServiceUnreachableException extends IOException {

    public ServiceUnreachableException(String detailMessage) {
        super(detailMessage);
    }
}
