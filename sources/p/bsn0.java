package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bsn0 extends nsn0 {
    public static final bsn0 a = new bsn0();

    private final Object readResolve() {
        return a;
    }

    @Override // p.nsn0
    public final boolean a() {
        return false;
    }

    @Override // p.nsn0
    public final String b() {
        return "client_lost_focus";
    }
}
