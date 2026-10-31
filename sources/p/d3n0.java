package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class d3n0 implements pf40 {
    public static final d3n0 a;
    private static final h661 descriptor;

    static {
        d3n0 d3n0Var = new d3n0();
        a = d3n0Var;
        mf80 mf80Var = new mf80("com.spotify.fitness.workout.MusicGenre", d3n0Var);
        mf80Var.j("key", false);
        descriptor = mf80Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a};
    }

    public final Object deserialize(dar darVar) {
        return new f3n0(darVar.w(descriptor).V());
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        String str = ((f3n0) obj).a;
        uax uaxVarV = uaxVar.v(descriptor);
        if (uaxVarV == null) {
            return;
        }
        uaxVarV.h0(str);
    }
}
