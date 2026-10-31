package androidx.car.app.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p.c6j0;
import p.e4p1;
import p.qrd;
import p.sxd1;
import p.vu50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class MessageTemplate implements sxd1 {
    private final List<Action> mActionList;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final CarText mDebugMessage;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final CarText mMessage;

    @Deprecated
    private final CarText mTitle;

    public MessageTemplate(c6j0 c6j0Var) {
        this.mIsLoading = c6j0Var.a;
        this.mTitle = c6j0Var.b;
        this.mMessage = c6j0Var.c;
        this.mDebugMessage = c6j0Var.d;
        this.mIcon = c6j0Var.e;
        this.mHeaderAction = c6j0Var.f;
        this.mActionStrip = c6j0Var.g;
        this.mActionList = e4p1.w(c6j0Var.h);
        this.mHeader = c6j0Var.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip) && Objects.equals(this.mHeader, messageTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getDebugMessage() {
        return this.mDebugMessage;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        vu50 vu50Var = new vu50();
        CarText carText = this.mTitle;
        if (carText != null) {
            vu50Var.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            vu50Var.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                vu50Var.a(it.next());
            }
        }
        return vu50Var.b();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        Objects.requireNonNull(carText);
        return carText;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "MessageTemplate";
    }

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}
