package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ce5 {
    public final ie5 a;
    public final int b;

    public ce5(int i, ie5 ie5Var) {
        this.a = ie5Var;
        this.b = i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "Finished";
        } else {
            str = "BoundReached";
        }
        sb.append(str);
        sb.append(", endState=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
