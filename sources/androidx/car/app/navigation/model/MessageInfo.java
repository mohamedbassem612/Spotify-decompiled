package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;
import p.izi0;
import p.jyn0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class MessageInfo implements jyn0 {
    private final CarIcon mImage;
    private final CarText mText;
    private final CarText mTitle;

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    public String toString() {
        return "MessageInfo";
    }

    public MessageInfo(izi0 izi0Var) {
        throw null;
    }
}
