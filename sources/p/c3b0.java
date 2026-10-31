package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class c3b0 extends k3b0 {
    public abstract Object a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof f3b0) {
            string = "\"" + ((Object) ((f3b0) this).a) + '\"';
        } else {
            string = a().toString();
        }
        return gvg.k(sb, string, ')');
    }
}
