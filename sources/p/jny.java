package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jny {
    public final CharSequence a;
    public final lny b;
    public final boolean c;

    public jny(CharSequence charSequence, lny lnyVar, kny knyVar, kny knyVar2, boolean z) {
        this.a = charSequence;
        this.b = lnyVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jny)) {
            return false;
        }
        jny jnyVar = (jny) obj;
        return u890.j(this.a, jnyVar.a) && this.b.equals(jnyVar.b) && u890.j((Object) null, (Object) null) && u890.j((Object) null, (Object) null) && this.c == jnyVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((mny.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 29791);
    }
}
