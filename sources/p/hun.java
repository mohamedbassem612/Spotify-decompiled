package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hun implements iun {
    public final cp11 a;
    public final CharSequence b;
    public final fun c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public hun(cp11 cp11Var, CharSequence charSequence, fun funVar, Integer num, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, boolean z3, boolean z4) {
        this.a = cp11Var;
        this.b = charSequence;
        this.c = funVar;
        this.d = num;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = z3;
        this.n = z4;
    }

    public static hun a(hun hunVar, CharSequence charSequence, fun funVar, Integer num, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, boolean z3, int i) {
        return new hun(hunVar.a, (i & 2) != 0 ? hunVar.b : charSequence, (i & 4) != 0 ? hunVar.c : funVar, (i & 8) != 0 ? hunVar.d : num, (i & 16) != 0 ? hunVar.e : str, (i & 32) != 0 ? hunVar.f : str2, (i & 64) != 0 ? hunVar.g : str3, (i & 128) != 0 ? hunVar.h : z, (i & 256) != 0 ? hunVar.i : z2, (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? hunVar.j : str4, (i & 1024) != 0 ? hunVar.k : str5, (i & 2048) != 0 ? hunVar.l : str6, (i & 4096) != 0 ? hunVar.m : z3, (i & 8192) != 0 ? hunVar.n : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hun)) {
            return false;
        }
        hun hunVar = (hun) obj;
        return this.a.equals(hunVar.a) && u890.j(this.b, hunVar.b) && u890.j(this.c, hunVar.c) && u890.j(this.d, hunVar.d) && u890.j(this.e, hunVar.e) && u890.j(this.f, hunVar.f) && u890.j(this.g, hunVar.g) && this.h == hunVar.h && this.i == hunVar.i && u890.j(this.j, hunVar.j) && u890.j(this.k, hunVar.k) && u890.j(this.l, hunVar.l) && this.m == hunVar.m && this.n == hunVar.n;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iG = xcg1.g(xcg1.g((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h), 31, this.i);
        String str4 = this.j;
        int iHashCode6 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        return Boolean.hashCode(this.n) + xcg1.g((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.m);
    }
}
