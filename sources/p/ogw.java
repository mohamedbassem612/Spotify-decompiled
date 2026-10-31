package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ogw implements pgw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ogw(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX WARN: Code duplicated, block: B:32:0x0048  */
    /* JADX WARN: Code duplicated, block: B:42:0x0060  */
    /* JADX WARN: Code duplicated, block: B:52:0x0076  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        boolean zEquals5;
        if (this != obj) {
            if (obj instanceof ogw) {
                ogw ogwVar = (ogw) obj;
                String str = ogwVar.a;
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
                    String str3 = ogwVar.b;
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
                        zEquals2 = str4.equals(str3);
                    }
                    if (zEquals2) {
                        String str5 = ogwVar.c;
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
                            nl7 nl7Var2 = ol7.b;
                            zEquals3 = str6.equals(str5);
                        }
                        if (zEquals3) {
                            String str7 = ogwVar.d;
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
                                zEquals4 = str8.equals(str7);
                            }
                            if (zEquals4) {
                                String str9 = ogwVar.e;
                                String str10 = this.e;
                                if (str10 == null) {
                                    if (str9 == null) {
                                        zEquals5 = true;
                                    } else {
                                        zEquals5 = false;
                                    }
                                } else if (str9 == null) {
                                    zEquals5 = false;
                                } else {
                                    nl7 nl7Var3 = ss20.b;
                                    zEquals5 = str10.equals(str9);
                                }
                                if (zEquals5 && u890.j(this.f, ogwVar.f)) {
                                }
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
        int iHashCode4 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            nl7 nl7Var2 = ol7.b;
            iHashCode2 = str3.hashCode();
        }
        int i2 = (iHashCode4 + iHashCode2) * 31;
        String str4 = this.d;
        int iHashCode5 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        if (str5 != null) {
            nl7 nl7Var3 = ss20.b;
            iHashCode3 = str5.hashCode();
        }
        return this.f.hashCode() + ((iHashCode5 + iHashCode3) * 961);
    }
}
