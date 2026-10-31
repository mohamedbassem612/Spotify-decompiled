package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class emc0 extends z511 {
    public final wi7 d;

    public emc0(anm1 anm1Var) {
        dmc0 dmc0Var = new dmc0(this);
        wi7 wi7Var = new wi7(new x5j1(this, (byte) 5), new gid(anm1Var).a());
        this.d = wi7Var;
        wi7Var.d.add(dmc0Var);
    }

    public final Object A(int i) {
        return this.d.f.get(i);
    }

    public void C(List list) {
        this.d.b(list, null);
    }

    @Override // p.z511
    public final int e() {
        return this.d.f.size();
    }

    public emc0(ow3 ow3Var) {
        dmc0 dmc0Var = new dmc0(this);
        wi7 wi7Var = new wi7(new x5j1(this, (byte) 5), ow3Var);
        this.d = wi7Var;
        wi7Var.d.add(dmc0Var);
    }

    public void B(List list, List list2) {
    }
}
