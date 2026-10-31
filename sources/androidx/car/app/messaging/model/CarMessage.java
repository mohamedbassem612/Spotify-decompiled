package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import java.util.Objects;
import p.mrd;
import p.mrs0;
import p.oto1;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return oto1.g(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
    }

    public CarText getBody() {
        return this.mBody;
    }

    public String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    public Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    public mrs0 getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return mrs0.a(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(oto1.n(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    public CarMessage(mrd mrdVar) {
        throw null;
    }
}
