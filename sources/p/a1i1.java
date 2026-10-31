package p;

import android.content.Context;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.base.java.logging.Logger;
import com.spotify.upsells.v1.proto.GetUpsellResponse;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a1i1 {
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final knm a;
    public final wpv0 b;
    public final yqg c;
    public final qy30 d;
    public final yzh1 e;
    public final Context f;
    public final llm g;

    static {
        ytw0 ytw0Var = jfv.b;
        h = fdg1.k0(10, ngv.e);
    }

    public a1i1(knm knmVar, wpv0 wpv0Var, yqg yqgVar, qy30 qy30Var, yzh1 yzh1Var, Context context, llm llmVar) {
        this.a = knmVar;
        this.b = wpv0Var;
        this.c = yqgVar;
        this.d = qy30Var;
        this.e = yzh1Var;
        this.f = context;
        this.g = llmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        x0i1 x0i1Var;
        if (onmVar instanceof x0i1) {
            x0i1Var = (x0i1) onmVar;
            int i2 = x0i1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0i1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                x0i1Var = new x0i1(this, onmVar);
            }
        } else {
            x0i1Var = new x0i1(this, onmVar);
        }
        Object objB = x0i1Var.a;
        int i3 = x0i1Var.c;
        String str = null;
        try {
            if (i3 == 0) {
                hm5.M(objB);
                yzh1 yzh1Var = this.e;
                x0i1Var.c = 1;
                yzh1Var.getClass();
                objB = yzh1.b(yzh1Var, x0i1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            str = (String) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to read legacy offer CTA for upsell shadow load", new Object[0]);
        }
        return new zzb0(str, this.f.getString(2131963528));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(z740 z740Var, e2i1 e2i1Var, zzb0 zzb0Var, onm onmVar) {
        y0i1 y0i1Var;
        long jE;
        z740 z740Var2;
        e2i1 e2i1Var2;
        zzb0 zzb0Var2;
        GetUpsellResponse getUpsellResponse;
        int iB;
        String strP;
        int i2;
        if (onmVar instanceof y0i1) {
            y0i1Var = (y0i1) onmVar;
            int i3 = y0i1Var.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y0i1Var.g = i3 - Integer.MIN_VALUE;
            } else {
                y0i1Var = new y0i1(this, onmVar);
            }
        } else {
            y0i1Var = new y0i1(this, onmVar);
        }
        y0i1 y0i1Var2 = y0i1Var;
        Object objN = y0i1Var2.e;
        int i4 = y0i1Var2.g;
        int i5 = 3;
        yqg yqgVar = this.c;
        String strA = null;
        try {
            if (i4 == 0) {
                hm5.M(objN);
                jE = yqgVar.e();
                try {
                    long j = h;
                    z740Var2 = z740Var;
                    e2i1Var2 = e2i1Var;
                    try {
                        vxg1 vxg1Var = new vxg1(this, z740Var2, e2i1Var2, (lnm) null, (byte) 7);
                        try {
                            y0i1Var2.a = z740Var2;
                            e2i1Var2 = e2i1Var;
                            y0i1Var2.b = e2i1Var2;
                            zzb0Var2 = zzb0Var;
                            try {
                                y0i1Var2.c = zzb0Var2;
                                y0i1Var2.d = jE;
                                y0i1Var2.g = 1;
                                objN = rc2.N(j, vxg1Var, y0i1Var2);
                                d9n d9nVar = d9n.a;
                                if (objN == d9nVar) {
                                    return d9nVar;
                                }
                                getUpsellResponse = (GetUpsellResponse) objN;
                                iB = v0i1.b(getUpsellResponse, e2i1Var2);
                            } catch (Exception e) {
                                e = e;
                                getUpsellResponse = null;
                                Logger.l(e, "Upsell shadow load request failed", new Object[0]);
                                se11 se11Var = v0i1.a;
                                if (e instanceof InvalidProtocolBufferException) {
                                    iB = 3;
                                } else {
                                    iB = 3;
                                }
                                z740 z740Var3 = z740Var2;
                                e2i1 e2i1Var3 = e2i1Var2;
                                ytw0 ytw0Var = jfv.b;
                                long jL0 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                                if (iB != 1) {
                                    if (getUpsellResponse == null) {
                                        strP = null;
                                    } else {
                                        strP = null;
                                    }
                                    se11 se11Var2 = v0i1.a;
                                    if (zzb0Var2 != null) {
                                        i5 = 6;
                                    } else {
                                        i5 = 6;
                                    }
                                    i2 = i5;
                                } else {
                                    if (getUpsellResponse == null) {
                                        strP = null;
                                    } else {
                                        strP = null;
                                    }
                                    se11 se11Var3 = v0i1.a;
                                    if (zzb0Var2 != null) {
                                        i5 = 6;
                                    } else {
                                        i5 = 6;
                                    }
                                    i2 = i5;
                                }
                                return new w0i1(z740Var3, e2i1Var3, iB, jL0, i2);
                            } catch (TimeoutCancellationException unused) {
                                getUpsellResponse = null;
                                iB = 7;
                                z740 z740Var4 = z740Var2;
                                e2i1 e2i1Var4 = e2i1Var2;
                                ytw0 ytw0Var2 = jfv.b;
                                long jL1 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                                if (iB != 1) {
                                    if (getUpsellResponse == null) {
                                        strP = null;
                                    } else {
                                        strP = null;
                                    }
                                    se11 se11Var4 = v0i1.a;
                                    if (zzb0Var2 != null) {
                                        i5 = 6;
                                    } else {
                                        i5 = 6;
                                    }
                                    i2 = i5;
                                } else {
                                    if (getUpsellResponse == null) {
                                        strP = null;
                                    } else {
                                        strP = null;
                                    }
                                    se11 se11Var5 = v0i1.a;
                                    if (zzb0Var2 != null) {
                                        i5 = 6;
                                    } else {
                                        i5 = 6;
                                    }
                                    i2 = i5;
                                }
                                return new w0i1(z740Var4, e2i1Var4, iB, jL1, i2);
                            }
                        } catch (TimeoutCancellationException unused2) {
                            e2i1Var2 = e2i1Var;
                            zzb0Var2 = zzb0Var;
                            getUpsellResponse = null;
                            iB = 7;
                            z740 z740Var5 = z740Var2;
                            e2i1 e2i1Var5 = e2i1Var2;
                            ytw0 ytw0Var3 = jfv.b;
                            long jL2 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                            if (iB != 1) {
                                if (getUpsellResponse == null) {
                                    strP = null;
                                } else {
                                    strP = null;
                                }
                                se11 se11Var6 = v0i1.a;
                                if (zzb0Var2 != null) {
                                    i5 = 6;
                                } else {
                                    i5 = 6;
                                }
                                i2 = i5;
                            } else {
                                if (getUpsellResponse == null) {
                                    strP = null;
                                } else {
                                    strP = null;
                                }
                                se11 se11Var7 = v0i1.a;
                                if (zzb0Var2 != null) {
                                    i5 = 6;
                                } else {
                                    i5 = 6;
                                }
                                i2 = i5;
                            }
                            return new w0i1(z740Var5, e2i1Var5, iB, jL2, i2);
                        } catch (Exception e2) {
                            e = e2;
                            e2i1Var2 = e2i1Var;
                            zzb0Var2 = zzb0Var;
                            getUpsellResponse = null;
                            Logger.l(e, "Upsell shadow load request failed", new Object[0]);
                            se11 se11Var8 = v0i1.a;
                            if (e instanceof InvalidProtocolBufferException) {
                                iB = 3;
                            } else {
                                iB = 3;
                            }
                            z740 z740Var6 = z740Var2;
                            e2i1 e2i1Var6 = e2i1Var2;
                            ytw0 ytw0Var4 = jfv.b;
                            long jL3 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                            if (iB != 1) {
                                if (getUpsellResponse == null) {
                                    strP = null;
                                } else {
                                    strP = null;
                                }
                                se11 se11Var9 = v0i1.a;
                                if (zzb0Var2 != null) {
                                    i5 = 6;
                                } else {
                                    i5 = 6;
                                }
                                i2 = i5;
                            } else {
                                if (getUpsellResponse == null) {
                                    strP = null;
                                } else {
                                    strP = null;
                                }
                                se11 se11Var10 = v0i1.a;
                                if (zzb0Var2 != null) {
                                    i5 = 6;
                                } else {
                                    i5 = 6;
                                }
                                i2 = i5;
                            }
                            return new w0i1(z740Var6, e2i1Var6, iB, jL3, i2);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        zzb0Var2 = zzb0Var;
                        getUpsellResponse = null;
                        Logger.l(e, "Upsell shadow load request failed", new Object[0]);
                        se11 se11Var11 = v0i1.a;
                        if (e instanceof InvalidProtocolBufferException) {
                            iB = 3;
                        } else {
                            iB = 3;
                        }
                        z740 z740Var7 = z740Var2;
                        e2i1 e2i1Var7 = e2i1Var2;
                        ytw0 ytw0Var5 = jfv.b;
                        long jL4 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                        if (iB != 1) {
                            if (getUpsellResponse == null) {
                                strP = null;
                            } else {
                                strP = null;
                            }
                            se11 se11Var12 = v0i1.a;
                            if (zzb0Var2 != null) {
                                i5 = 6;
                            } else {
                                i5 = 6;
                            }
                            i2 = i5;
                        } else {
                            if (getUpsellResponse == null) {
                                strP = null;
                            } else {
                                strP = null;
                            }
                            se11 se11Var13 = v0i1.a;
                            if (zzb0Var2 != null) {
                                i5 = 6;
                            } else {
                                i5 = 6;
                            }
                            i2 = i5;
                        }
                        return new w0i1(z740Var7, e2i1Var7, iB, jL4, i2);
                    } catch (TimeoutCancellationException unused3) {
                        zzb0Var2 = zzb0Var;
                        getUpsellResponse = null;
                        iB = 7;
                        z740 z740Var8 = z740Var2;
                        e2i1 e2i1Var8 = e2i1Var2;
                        ytw0 ytw0Var6 = jfv.b;
                        long jL5 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                        if (iB != 1) {
                            if (getUpsellResponse == null) {
                                strP = null;
                            } else {
                                strP = null;
                            }
                            se11 se11Var14 = v0i1.a;
                            if (zzb0Var2 != null) {
                                i5 = 6;
                            } else {
                                i5 = 6;
                            }
                            i2 = i5;
                        } else {
                            if (getUpsellResponse == null) {
                                strP = null;
                            } else {
                                strP = null;
                            }
                            se11 se11Var15 = v0i1.a;
                            if (zzb0Var2 != null) {
                                i5 = 6;
                            } else {
                                i5 = 6;
                            }
                            i2 = i5;
                        }
                        return new w0i1(z740Var8, e2i1Var8, iB, jL5, i2);
                    }
                } catch (Exception e4) {
                    e = e4;
                    z740Var2 = z740Var;
                } catch (TimeoutCancellationException unused4) {
                    z740Var2 = z740Var;
                }
            } else {
                if (i4 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = y0i1Var2.d;
                zzb0 zzb0Var3 = y0i1Var2.c;
                e2i1 e2i1Var9 = y0i1Var2.b;
                z740 z740Var9 = y0i1Var2.a;
                try {
                    hm5.M(objN);
                    jE = j2;
                    zzb0Var2 = zzb0Var3;
                    e2i1Var2 = e2i1Var9;
                    z740Var2 = z740Var9;
                    getUpsellResponse = (GetUpsellResponse) objN;
                    try {
                        iB = v0i1.b(getUpsellResponse, e2i1Var2);
                    } catch (TimeoutCancellationException unused5) {
                        iB = 7;
                    } catch (Exception e5) {
                        e = e5;
                        Logger.l(e, "Upsell shadow load request failed", new Object[0]);
                        se11 se11Var16 = v0i1.a;
                        if (e instanceof InvalidProtocolBufferException) {
                            iB = 3;
                        } else {
                            iB = 3;
                        }
                    }
                } catch (TimeoutCancellationException unused6) {
                    jE = j2;
                    zzb0Var2 = zzb0Var3;
                    e2i1Var2 = e2i1Var9;
                    z740Var2 = z740Var9;
                    getUpsellResponse = null;
                    iB = 7;
                    z740 z740Var10 = z740Var2;
                    e2i1 e2i1Var10 = e2i1Var2;
                    ytw0 ytw0Var7 = jfv.b;
                    long jL6 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                    if (iB != 1) {
                        if (getUpsellResponse == null) {
                            strP = null;
                        } else {
                            strP = null;
                        }
                        se11 se11Var17 = v0i1.a;
                        if (zzb0Var2 != null) {
                            i5 = 6;
                        } else {
                            i5 = 6;
                        }
                        i2 = i5;
                    } else {
                        if (getUpsellResponse == null) {
                            strP = null;
                        } else {
                            strP = null;
                        }
                        se11 se11Var18 = v0i1.a;
                        if (zzb0Var2 != null) {
                            i5 = 6;
                        } else {
                            i5 = 6;
                        }
                        i2 = i5;
                    }
                    return new w0i1(z740Var10, e2i1Var10, iB, jL6, i2);
                } catch (Exception e6) {
                    e = e6;
                    jE = j2;
                    zzb0Var2 = zzb0Var3;
                    e2i1Var2 = e2i1Var9;
                    z740Var2 = z740Var9;
                    getUpsellResponse = null;
                    Logger.l(e, "Upsell shadow load request failed", new Object[0]);
                    se11 se11Var19 = v0i1.a;
                    if ((e instanceof InvalidProtocolBufferException) || (e.getCause() instanceof InvalidProtocolBufferException)) {
                        iB = 3;
                    } else {
                        iB = ((e instanceof HttpException) || (e instanceof IOException)) ? 6 : 8;
                    }
                    z740 z740Var11 = z740Var2;
                    e2i1 e2i1Var11 = e2i1Var2;
                    ytw0 ytw0Var8 = jfv.b;
                    long jL7 = fdg1.l0(yqgVar.e() - jE, ngv.d);
                    if (iB != 1) {
                        if (getUpsellResponse == null) {
                            strP = null;
                        } else {
                            strP = null;
                        }
                        se11 se11Var110 = v0i1.a;
                        if (zzb0Var2 != null) {
                            i5 = 6;
                        } else {
                            i5 = 6;
                        }
                        i2 = i5;
                    } else {
                        if (getUpsellResponse == null) {
                            strP = null;
                        } else {
                            strP = null;
                        }
                        se11 se11Var111 = v0i1.a;
                        if (zzb0Var2 != null) {
                            i5 = 6;
                        } else {
                            i5 = 6;
                        }
                        i2 = i5;
                    }
                    return new w0i1(z740Var11, e2i1Var11, iB, jL7, i2);
                }
            }
            z740 z740Var12 = z740Var2;
            e2i1 e2i1Var12 = e2i1Var2;
            ytw0 ytw0Var9 = jfv.b;
            long jL8 = fdg1.l0(yqgVar.e() - jE, ngv.d);
            if (iB != 1 || iB == 2) {
                if (getUpsellResponse == null && getUpsellResponse.q()) {
                    strP = getUpsellResponse.n().q().p();
                } else {
                    strP = null;
                }
                se11 se11Var112 = v0i1.a;
                if (zzb0Var2 != null || strP == null || ihc1.y0(strP)) {
                    i5 = 6;
                } else {
                    String strA2 = v0i1.a(strP);
                    boolean zEquals = strA2.equals(v0i1.a(zzb0Var2.b));
                    String str = zzb0Var2.a;
                    if (str != null) {
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            strA = v0i1.a(str);
                        }
                    }
                    if (strA == null && zEquals) {
                        i5 = 2;
                    } else if (strA == null) {
                        i5 = 5;
                    } else if (zEquals) {
                        i5 = 4;
                    } else if (strA.equals(strA2)) {
                        i5 = 1;
                    }
                }
                i2 = i5;
            } else {
                i2 = 6;
            }
            return new w0i1(z740Var12, e2i1Var12, iB, jL8, i2);
        } catch (CancellationException e7) {
            throw e7;
        }
    }
}
