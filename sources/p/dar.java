package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface dar {
    short C();

    float F();

    double H();

    boolean K();

    char N();

    int T(h661 h661Var);

    String V();

    boolean X();

    default Object Y(nma0 nma0Var) {
        return nma0Var.deserialize(this);
    }

    x1k b(h661 h661Var);

    byte c0();

    int n();

    long u();

    dar w(h661 h661Var);
}
