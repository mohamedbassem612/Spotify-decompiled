package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bv00 implements p8h {
    public final q8n b;
    public mmr0 c;
    public final Object e;
    public final /* synthetic */ byte a = 0;
    public final xgn0 d = ygn0.a();

    public bv00(ynb0 ynb0Var, q8n q8nVar) {
        this.e = ynb0Var;
        this.b = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: all -> 0x0044, Exception -> 0x0047, CancellationException -> 0x00b6, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:15:0x003f, B:38:0x00a7, B:40:0x00af, B:46:0x00be), top: B:104:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170 A[Catch: all -> 0x0107, Exception -> 0x010a, CancellationException -> 0x0177, TRY_LEAVE, TryCatch #5 {all -> 0x0107, blocks: (B:64:0x0102, B:87:0x0168, B:89:0x0170, B:95:0x017f), top: B:105:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.o8n, p.q8n] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // p.p8h
    public final Object a(String str, String str2, String str3, onm onmVar) throws Throwable {
        av00 av00Var;
        String str4;
        int i;
        mmr0 mmr0Var;
        vgn0 vgn0Var;
        String str5;
        String str6;
        String str7;
        uw70 uw70Var;
        String str8;
        int i2;
        mmr0 mmr0Var2;
        vgn0 vgn0Var2;
        String str9;
        String str10;
        String str11;
        byte b = this.a;
        ?? r3 = this.b;
        vgn0 vgn0Var3 = this.d;
        d9n d9nVar = d9n.a;
        String str12 = "";
        switch (b) {
            case 0:
                if (onmVar instanceof av00) {
                    av00Var = (av00) onmVar;
                    int i3 = av00Var.f;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        av00Var.f = i3 - Integer.MIN_VALUE;
                    } else {
                        av00Var = new av00(this, onmVar);
                    }
                } else {
                    av00Var = new av00(this, onmVar);
                }
                Object obj = av00Var.d;
                int i4 = av00Var.f;
                try {
                    try {
                        try {
                            if (i4 == 0) {
                                hm5.M(obj);
                                str4 = str2;
                                av00Var.a = str4;
                                av00Var.b = vgn0Var3;
                                av00Var.c = 0;
                                av00Var.f = 1;
                                if (vgn0Var3.a(av00Var) == d9nVar) {
                                    return d9nVar;
                                }
                                i = 0;
                            } else {
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        eg.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    vgn0Var = av00Var.b;
                                    str5 = av00Var.a;
                                    try {
                                        hm5.M(obj);
                                        str7 = (String) obj;
                                        if (str7.length() > 0) {
                                            this.c = oqn1.n(str5, str7);
                                        }
                                        str12 = str7;
                                        break;
                                    } catch (CancellationException unused) {
                                    } catch (Exception e) {
                                        e = e;
                                        Logger.e(e, "Error fetching color for " + str5, new Object[0]);
                                    }
                                    vgn0Var3 = vgn0Var;
                                    str6 = str12;
                                    vgn0Var3.c(null);
                                    return str6;
                                }
                                int i5 = av00Var.c;
                                vgn0 vgn0Var4 = av00Var.b;
                                String str13 = av00Var.a;
                                hm5.M(obj);
                                i = i5;
                                vgn0Var3 = vgn0Var4;
                                str4 = str13;
                            }
                            if (mmr0Var != null) {
                                String str14 = (String) mmr0Var.a;
                                String str15 = (String) mmr0Var.b;
                                if (u890.j(str4, str14)) {
                                    str6 = str15;
                                }
                                vgn0Var3.c(null);
                                return str6;
                            }
                            xr00 xr00Var = new xr00(this, str4, (lnm) null, (byte) 2);
                            av00Var.a = str4;
                            av00Var.b = vgn0Var3;
                            av00Var.c = i;
                            av00Var.f = 2;
                            Object objH = c921.H((o8n) r3, xr00Var, av00Var);
                            if (objH == d9nVar) {
                                return d9nVar;
                            }
                            vgn0 vgn0Var5 = vgn0Var3;
                            str5 = str4;
                            obj = objH;
                            vgn0Var = vgn0Var5;
                            str7 = (String) obj;
                            if (str7.length() > 0) {
                                this.c = oqn1.n(str5, str7);
                                break;
                            }
                            str12 = str7;
                            vgn0Var3 = vgn0Var;
                            str6 = str12;
                            vgn0Var3.c(null);
                            return str6;
                        } catch (CancellationException unused2) {
                            vgn0Var = vgn0Var3;
                        } catch (Exception e2) {
                            e = e2;
                            vgn0Var = vgn0Var3;
                            str5 = str4;
                            Logger.e(e, "Error fetching color for " + str5, new Object[0]);
                        }
                        mmr0Var = this.c;
                    } catch (Throwable th) {
                        th = th;
                        r3 = vgn0Var3;
                        r3.c(null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                if (onmVar instanceof uw70) {
                    uw70Var = (uw70) onmVar;
                    int i6 = uw70Var.f;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        uw70Var.f = i6 - Integer.MIN_VALUE;
                    } else {
                        uw70Var = new uw70(this, onmVar);
                    }
                } else {
                    uw70Var = new uw70(this, onmVar);
                }
                Object obj2 = uw70Var.d;
                int i7 = uw70Var.f;
                try {
                    try {
                        try {
                            if (i7 == 0) {
                                hm5.M(obj2);
                                str8 = str3;
                                uw70Var.a = str8;
                                uw70Var.b = vgn0Var3;
                                uw70Var.c = 0;
                                uw70Var.f = 1;
                                if (vgn0Var3.a(uw70Var) == d9nVar) {
                                    return d9nVar;
                                }
                                i2 = 0;
                            } else {
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        eg.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    vgn0Var2 = uw70Var.b;
                                    str9 = uw70Var.a;
                                    try {
                                        hm5.M(obj2);
                                        str11 = (String) obj2;
                                        if (str11.length() > 0) {
                                            this.c = oqn1.n(str9, str11);
                                        }
                                        str12 = str11;
                                        break;
                                    } catch (CancellationException unused3) {
                                    } catch (Exception e3) {
                                        e = e3;
                                        Logger.e(e, "Error fetching color from image-metadata for " + str9, new Object[0]);
                                        e.printStackTrace();
                                    }
                                    vgn0Var3 = vgn0Var2;
                                    str10 = str12;
                                    vgn0Var3.c(null);
                                    return str10;
                                }
                                int i8 = uw70Var.c;
                                vgn0 vgn0Var6 = uw70Var.b;
                                String str16 = uw70Var.a;
                                hm5.M(obj2);
                                i2 = i8;
                                vgn0Var3 = vgn0Var6;
                                str8 = str16;
                            }
                            if (mmr0Var2 != null) {
                                String str17 = (String) mmr0Var2.a;
                                String str18 = (String) mmr0Var2.b;
                                if (u890.j(str8, str17)) {
                                    str10 = str18;
                                }
                                vgn0Var3.c(null);
                                return str10;
                            }
                            a38 a38Var = new a38(str8, this, (lnm) null, (byte) 10);
                            uw70Var.a = str8;
                            uw70Var.b = vgn0Var3;
                            uw70Var.c = i2;
                            uw70Var.f = 2;
                            Object objH2 = c921.H((o8n) r3, a38Var, uw70Var);
                            if (objH2 == d9nVar) {
                                return d9nVar;
                            }
                            vgn0 vgn0Var7 = vgn0Var3;
                            str9 = str8;
                            obj2 = objH2;
                            vgn0Var2 = vgn0Var7;
                            str11 = (String) obj2;
                            if (str11.length() > 0) {
                                this.c = oqn1.n(str9, str11);
                                break;
                            }
                            str12 = str11;
                            vgn0Var3 = vgn0Var2;
                            str10 = str12;
                            vgn0Var3.c(null);
                            return str10;
                        } catch (CancellationException unused4) {
                            vgn0Var2 = vgn0Var3;
                        } catch (Exception e4) {
                            e = e4;
                            vgn0Var2 = vgn0Var3;
                            str9 = str8;
                            Logger.e(e, "Error fetching color from image-metadata for " + str9, new Object[0]);
                            e.printStackTrace();
                        }
                        mmr0Var2 = this.c;
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = vgn0Var3;
                        r3.c(null);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
        }
    }

    public bv00(uu00 uu00Var, q8n q8nVar) {
        this.e = uu00Var;
        this.b = q8nVar;
    }
}
