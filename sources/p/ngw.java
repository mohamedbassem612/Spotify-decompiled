package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ngw implements pgw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public ngw(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX WARN: Code duplicated, block: B:32:0x0049  */
    /* JADX WARN: Code duplicated, block: B:42:0x005f  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        if (this != obj) {
            if (obj instanceof ngw) {
                ngw ngwVar = (ngw) obj;
                String str = ngwVar.a;
                String str2 = this.a;
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
                    String str3 = ngwVar.b;
                    String str4 = this.b;
                    if (str4 == null) {
                        if (str3 == null) {
                            zEquals2 = true;
                        } else {
                            zEquals2 = false;
                        }
                    } else if (str3 == null) {
                        zEquals2 = false;
                    } else {
                        nl7 nl7Var2 = ol7.b;
                        zEquals2 = str4.equals(str3);
                    }
                    if (zEquals2) {
                        String str5 = ngwVar.c;
                        String str6 = this.c;
                        if (str6 == null) {
                            if (str5 == null) {
                                zEquals3 = true;
                            } else {
                                zEquals3 = false;
                            }
                        } else if (str5 == null) {
                            zEquals3 = false;
                        } else {
                            zEquals3 = str6.equals(str5);
                        }
                        if (zEquals3) {
                            String str7 = ngwVar.d;
                            String str8 = this.d;
                            if (str8 == null) {
                                if (str7 == null) {
                                    zEquals4 = true;
                                } else {
                                    zEquals4 = false;
                                }
                            } else if (str7 == null) {
                                zEquals4 = false;
                            } else {
                                nl7 nl7Var3 = ss20.b;
                                zEquals4 = str8.equals(str7);
                            }
                            if (zEquals4 && u890.j(this.e, ngwVar.e) && this.f == ngwVar.f) {
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
        int iHashCode3 = 0;
        String str = this.a;
        if (str == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = dyf.b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            nl7 nl7Var2 = ol7.b;
            iHashCode2 = str2.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        String str3 = this.c;
        int iHashCode4 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        if (str4 != null) {
            nl7 nl7Var3 = ss20.b;
            iHashCode3 = str4.hashCode();
        }
        return Boolean.hashCode(this.f) + cy30.d((iHashCode4 + iHashCode3) * 31, 961, this.e);
    }
}
