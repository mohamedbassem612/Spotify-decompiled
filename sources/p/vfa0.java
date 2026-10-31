package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vfa0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;

    public vfa0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, String str2, boolean z8, boolean z9, int i, boolean z10) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = str;
        this.h = z7;
        this.i = str2;
        this.j = z8;
        this.k = z9;
        this.l = i;
        this.m = z10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.b);
        sb.append(", isLenient=");
        sb.append(this.c);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.d);
        sb.append(", prettyPrint=");
        sb.append(this.e);
        sb.append(", explicitNulls=");
        sb.append(this.f);
        sb.append(", prettyPrintIndent='");
        sb.append(this.g);
        sb.append("', coerceInputValues=");
        sb.append(this.h);
        sb.append(", useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.i);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.j);
        sb.append(", useAlternativeNames=");
        sb.append(this.k);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(ktd.w(this.l));
        sb.append(", exceptionsWithDebugInfo=");
        return f4i1.g(sb, this.m, ')');
    }
}
