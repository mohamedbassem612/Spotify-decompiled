package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ldn1 extends yii0 {
    public final xii0 a;
    public final v311 b;

    public ldn1(xii0 xii0Var, v311 v311Var) {
        this.a = xii0Var;
        this.b = v311Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yii0) {
            ldn1 ldn1Var = (ldn1) ((yii0) obj);
            if (this.a.equals(ldn1Var.a) && this.b.equals(ldn1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return cy30.p("MeetingStatus{status=", this.a.toString(), ", recordingInfo=", this.b.toString(), "}");
    }
}
