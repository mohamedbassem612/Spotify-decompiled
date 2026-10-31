package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface uax {
    void J();

    void O(short s);

    void P(boolean z);

    void S(float f);

    void U(char c);

    default void W(nma0 nma0Var, Object obj) {
        if (nma0Var.getDescriptor().b()) {
            i(nma0Var, obj);
        } else if (obj == null) {
            J();
        } else {
            i(nma0Var, obj);
        }
    }

    void a0(int i);

    z1k b(h661 h661Var);

    kl1 c();

    default z1k g0(h661 h661Var, int i) {
        return b(h661Var);
    }

    void h(double d);

    void h0(String str);

    default void i(nma0 nma0Var, Object obj) {
        nma0Var.serialize(this, obj);
    }

    void j(byte b);

    void r(h661 h661Var, int i);

    uax v(h661 h661Var);

    void z(long j);
}
