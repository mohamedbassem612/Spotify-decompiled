package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mgw implements pgw {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    public mgw(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        if (this != obj) {
            if (obj instanceof mgw) {
                mgw mgwVar = (mgw) obj;
                if (u890.j(this.a, mgwVar.a) && u890.j(this.b, mgwVar.b) && u890.j(this.c, mgwVar.c) && this.d == mgwVar.d && this.e == mgwVar.e) {
                    String str = mgwVar.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        nl7 nl7Var = dyf.b;
                        zEquals = str2.equals(str);
                    }
                    if (zEquals) {
                        String str3 = mgwVar.g;
                        String str4 = this.g;
                        if (str4 == null) {
                            if (str3 == null) {
                                zEquals2 = true;
                            } else {
                                zEquals2 = false;
                            }
                        } else if (str3 == null) {
                            zEquals2 = false;
                        } else {
                            nl7 nl7Var2 = ss20.b;
                            zEquals2 = str4.equals(str3);
                        }
                        if (zEquals2) {
                            String str5 = mgwVar.h;
                            String str6 = this.h;
                            if (str6 == null) {
                                if (str5 == null) {
                                    zEquals3 = true;
                                } else {
                                    zEquals3 = false;
                                }
                            } else if (str5 == null) {
                                zEquals3 = false;
                            } else {
                                nl7 nl7Var3 = ol7.b;
                                zEquals3 = str6.equals(str5);
                            }
                            if (!zEquals3) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = this.a.hashCode() * 31;
        int iHashCode4 = 0;
        String str = this.b;
        int iK = ab80.k(this.e, xcg1.g(cy30.d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31);
        String str2 = this.f;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = dyf.b;
            iHashCode = str2.hashCode();
        }
        int i = (iK + iHashCode) * 31;
        String str3 = this.g;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            nl7 nl7Var2 = ss20.b;
            iHashCode2 = str3.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        String str4 = this.h;
        if (str4 != null) {
            nl7 nl7Var3 = ol7.b;
            iHashCode4 = str4.hashCode();
        }
        return i2 + iHashCode4;
    }
}
