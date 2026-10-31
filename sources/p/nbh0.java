package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nbh0 implements jbh0 {
    public jbh0 a;
    public final /* synthetic */ Iterable b;

    public nbh0(Iterable iterable) {
        this.b = iterable;
    }

    @Override // p.jbh0
    public final String description() {
        StringBuilder sb = new StringBuilder(1024);
        String str = "";
        for (jbh0 jbh0Var : this.b) {
            String str2 = u890.j(this.a, jbh0Var) ? "*" : "";
            sb.append(str);
            sb.append(str2);
            sb.append(jbh0Var.description());
            sb.append(str2);
            str = " AND ";
        }
        return sb.toString();
    }

    @Override // p.jbh0
    public final boolean match(Object obj) {
        this.a = null;
        for (jbh0 jbh0Var : this.b) {
            if (!jbh0Var.match(obj)) {
                this.a = jbh0Var;
                return false;
            }
        }
        return true;
    }
}
