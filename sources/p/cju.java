package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cju implements i01 {
    public final /* synthetic */ byte a;
    public final ao0 b;
    public String c;
    public Function0 d;
    public boolean e;
    public int f = -1;
    public volatile boolean g;
    public volatile boolean h;

    public /* synthetic */ cju(ao0 ao0Var, byte b) {
        this.a = b;
        this.b = ao0Var;
    }

    @Override // p.i01
    public final void a(String str, jxb0 jxb0Var) {
        switch (this.a) {
            case 0:
                if (this.c != null) {
                    this.e = false;
                    this.g = false;
                    this.h = this.f > 0;
                }
                this.c = str;
                this.d = jxb0Var;
                if (this.h) {
                    ao0.a(this.b, co0.i1, str, (Long) null, (String) null, (String) null, 124);
                    this.h = false;
                }
                break;
            default:
                if (this.c != null) {
                    this.e = false;
                    this.g = false;
                    this.h = this.f > 0;
                }
                this.c = str;
                this.d = jxb0Var;
                if (this.h) {
                    ao0.a(this.b, co0.i1, str, (Long) null, (String) null, (String) null, 124);
                    this.h = false;
                }
                break;
        }
    }

    @Override // p.i01
    public final void b(int i) {
        switch (this.a) {
            case 0:
                d(i);
                if (this.g) {
                    String str = this.c;
                    if (str != null && this.f < 50 && i >= 50) {
                        ao0.a(this.b, co0.j1, str, (Long) null, (String) null, (String) null, 124);
                    }
                    String str2 = this.c;
                    if (str2 != null && this.f >= 50 && i < 50) {
                        ao0.a(this.b, co0.k1, str2, (Long) null, (String) null, (String) null, 124);
                    }
                    String str3 = this.c;
                    if (str3 != null && this.f > 0 && i <= 0) {
                        ao0.a(this.b, co0.h1, str3, (Long) null, (String) null, (String) null, 124);
                    }
                    String str4 = this.c;
                    if (str4 != null && this.f < 100 && i >= 100) {
                        ao0.a(this.b, co0.l1, str4, (Long) null, (String) null, (String) null, 124);
                    }
                }
                if (this.f <= 0 && i > 0) {
                    String str5 = this.c;
                    if (str5 != null) {
                        ao0.a(this.b, co0.i1, str5, (Long) null, (String) null, (String) null, 124);
                    } else {
                        this.h = true;
                    }
                }
                this.f = i;
                break;
            default:
                if (this.g) {
                    String str6 = this.c;
                    if (str6 != null && this.f < 50 && i >= 50) {
                        ao0.a(this.b, co0.j1, str6, (Long) null, (String) null, (String) null, 124);
                    }
                    String str7 = this.c;
                    if (str7 != null && this.f >= 50 && i < 50) {
                        ao0.a(this.b, co0.k1, str7, (Long) null, (String) null, (String) null, 124);
                    }
                    String str8 = this.c;
                    if (str8 != null && this.f > 0 && i <= 0) {
                        ao0.a(this.b, co0.h1, str8, (Long) null, (String) null, (String) null, 124);
                    }
                    String str9 = this.c;
                    if (str9 != null && this.f < 100 && i >= 100) {
                        ao0.a(this.b, co0.l1, str9, (Long) null, (String) null, (String) null, 124);
                    }
                }
                if (this.f <= 0 && i > 0) {
                    String str10 = this.c;
                    if (str10 != null) {
                        ao0.a(this.b, co0.i1, str10, (Long) null, (String) null, (String) null, 124);
                    } else {
                        this.h = true;
                    }
                }
                this.f = i;
                break;
        }
    }

    @Override // p.i01
    public final void c(String str) {
        gq0 gq0Var;
        String strD;
        switch (this.a) {
            case 0:
                String str2 = this.c;
                if (!(str2 != null ? str.equals(str2) : false)) {
                    String str3 = this.c;
                    strD = str3 != null ? gq0.d(str3) : "null";
                    n57.f("onAssetLoaded called for mismatched ad identifier", "expected " + strD + " but got " + gq0.d(str));
                    break;
                } else if (!this.e) {
                    this.e = true;
                    ao0 ao0Var = this.b;
                    co0 co0Var = co0.e1;
                    String str4 = this.c;
                    gq0Var = str4 != null ? new gq0(str4) : null;
                    if (gq0Var == null) {
                        hhg1.n("Required value was null.");
                    } else {
                        ao0.a(ao0Var, co0Var, gq0Var.a, (Long) null, (String) null, (String) null, 124);
                        d(this.f);
                    }
                    break;
                }
                break;
            default:
                String str5 = this.c;
                if (!(str5 != null ? str.equals(str5) : false)) {
                    String str6 = this.c;
                    strD = str6 != null ? gq0.d(str6) : "null";
                    n57.f("onAssetLoaded called for mismatched ad identifier", "expected " + strD + " but got " + gq0.d(str));
                    break;
                } else if (!this.e) {
                    this.e = true;
                    ao0 ao0Var2 = this.b;
                    co0 co0Var2 = co0.e1;
                    String str7 = this.c;
                    gq0 gq0Var2 = str7 != null ? new gq0(str7) : null;
                    if (gq0Var2 == null) {
                        hhg1.n("Required value was null.");
                        break;
                    } else {
                        ao0.a(ao0Var2, co0Var2, gq0Var2.a, (Long) null, (String) null, (String) null, 124);
                        int i = this.f;
                        if (this.e && !this.g) {
                            ao0 ao0Var3 = this.b;
                            co0 co0Var3 = co0.Z;
                            String str8 = this.c;
                            gq0 gq0Var3 = str8 != null ? new gq0(str8) : null;
                            if (gq0Var3 == null) {
                                hhg1.n("Required value was null.");
                            } else {
                                ao0.a(ao0Var3, co0Var3, gq0Var3.a, (Long) null, (String) null, (String) null, 124);
                                this.g = true;
                                Function0 function0 = this.d;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                ao0 ao0Var4 = this.b;
                                if (i >= 50) {
                                    co0 co0Var4 = co0.j1;
                                    String str9 = this.c;
                                    gq0Var = str9 != null ? new gq0(str9) : null;
                                    if (gq0Var == null) {
                                        hhg1.n("Required value was null.");
                                    } else {
                                        ao0.a(ao0Var4, co0Var4, gq0Var.a, (Long) null, (String) null, (String) null, 124);
                                    }
                                } else {
                                    co0 co0Var5 = co0.k1;
                                    String str10 = this.c;
                                    gq0Var = str10 != null ? new gq0(str10) : null;
                                    if (gq0Var == null) {
                                        hhg1.n("Required value was null.");
                                    } else {
                                        ao0.a(ao0Var4, co0Var5, gq0Var.a, (Long) null, (String) null, (String) null, 124);
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public void d(int i) {
        gq0 gq0Var;
        if (!this.e || i <= 0 || this.g) {
            return;
        }
        ao0 ao0Var = this.b;
        co0 co0Var = co0.Z;
        String str = this.c;
        gq0 gq0Var2 = str != null ? new gq0(str) : null;
        if (gq0Var2 == null) {
            hhg1.n("Required value was null.");
            return;
        }
        ao0.a(ao0Var, co0Var, gq0Var2.a, (Long) null, (String) null, (String) null, 124);
        this.g = true;
        Function0 function0 = this.d;
        if (function0 != null) {
            function0.invoke();
        }
        ao0 ao0Var2 = this.b;
        if (i < 50) {
            co0 co0Var2 = co0.k1;
            String str2 = this.c;
            gq0Var = str2 != null ? new gq0(str2) : null;
            if (gq0Var != null) {
                ao0.a(ao0Var2, co0Var2, gq0Var.a, (Long) null, (String) null, (String) null, 124);
                return;
            } else {
                hhg1.n("Required value was null.");
                return;
            }
        }
        co0 co0Var3 = co0.j1;
        String str3 = this.c;
        gq0Var = str3 != null ? new gq0(str3) : null;
        if (gq0Var != null) {
            ao0.a(ao0Var2, co0Var3, gq0Var.a, (Long) null, (String) null, (String) null, 124);
        } else {
            hhg1.n("Required value was null.");
        }
    }
}
