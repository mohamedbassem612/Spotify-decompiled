package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class kav0 {
    public static final int $stable = 8;
    private boolean isAttached;
    private elb0 layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final elb0 getLayoutCoordinates$ui() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return true;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m638getSizeYbymL2g() {
        elb0 elb0Var = this.layoutCoordinates;
        if (elb0Var != null) {
            return elb0Var.b();
        }
        return 0L;
    }

    public final boolean isAttached$ui() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public abstract void mo85onPointerEventH0pRuoY(bav0 bav0Var, cav0 cav0Var, long j);

    public final void setAttached$ui(boolean z) {
        this.isAttached = z;
    }

    public final void setLayoutCoordinates$ui(elb0 elb0Var) {
        this.layoutCoordinates = elb0Var;
    }
}
