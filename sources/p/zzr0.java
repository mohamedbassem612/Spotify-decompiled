package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zzr0 implements wf81 {
    public final bpb1 a;
    public final xe01 b;

    public zzr0() {
        bpb1 bpb1VarB = gio1.b(Boolean.TRUE);
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
    }

    public final void a(boolean z) {
        this.a.m((Object) null, Boolean.valueOf(z));
    }

    public final xe01 b() {
        return this.b;
    }

    public final boolean c() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }
}
