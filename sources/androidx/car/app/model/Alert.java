package androidx.car.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p.mh3;
import p.oh3;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Alert {
    public static final int DURATION_SHOW_INDEFINITELY = Integer.MAX_VALUE;
    private static final int MAX_ACTION_COUNT = 2;
    private final List<Action> mActions;
    private final oh3 mCallbackDelegate;
    private final long mDuration;
    private final CarIcon mIcon;
    private final int mId;
    private final CarText mSubtitle;
    private final CarText mTitle;

    private Alert() {
        this.mId = 0;
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public oh3 getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId));
    }

    public String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + "]";
    }

    public Alert(mh3 mh3Var) {
        throw null;
    }
}
