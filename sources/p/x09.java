package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x09 implements i670 {
    public String a;
    public String b;
    public String c;
    public String d;

    public i670 a(String str) {
        this.d = str;
        return this;
    }

    public i670 b(String str) {
        this.b = str;
        return this;
    }

    public id70 build() {
        id70 id70Var = id70.c;
        return new id70(this.a, this.b, this.c, this.d);
    }
}
