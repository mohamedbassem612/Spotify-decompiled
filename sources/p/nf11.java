package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nf11 {
    public vy11 a;
    public vy11 b;
    public dbm c;
    public pl10[] d;
    public boolean e;
    public char f;

    public final uxy0 a() {
        zod.j("Must set register function", this.a != null);
        zod.j("Must set unregister function", this.b != null);
        zod.j("Must set holder", this.c != null);
        c9d0 c9d0Var = (c9d0) this.c.b;
        zod.t(c9d0Var, "Key must not be null");
        return new uxy0(new lne(this, this.c, this.d, this.e, this.f), new bym1(this, c9d0Var, false, (byte) 3), (byte) 14);
    }
}
