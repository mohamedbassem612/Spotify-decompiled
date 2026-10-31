package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.base.java.logging.Logger;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.remoteconfig.commons.nebula.GetAttributesResponse;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fqb {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public fqb(opb opbVar, pz11 pz11Var, lw21 lw21Var, xav0 xav0Var, yqg yqgVar, lo9 lo9Var) {
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        this.b = opbVar;
        this.c = lw21Var;
        this.d = xav0Var;
        this.e = yqgVar;
        this.f = lo9Var;
        this.g = b3sVar;
        this.a = qtw0.a.contains("com.spotify.music");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(iu30 iu30Var, onm onmVar) {
        aqb aqbVar;
        if (onmVar instanceof aqb) {
            aqbVar = (aqb) onmVar;
            int i = aqbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqbVar.c = i - Integer.MIN_VALUE;
            } else {
                aqbVar = new aqb(this, onmVar);
            }
        } else {
            aqbVar = new aqb(this, onmVar);
        }
        Object obj = aqbVar.a;
        int i2 = aqbVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            aqbVar.c = 1;
            Object objInvoke = iu30Var.invoke(aqbVar);
            Object obj2 = d9n.a;
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (spb e2) {
            return new m231(e2);
        } catch (Exception e3) {
            return new m231(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [byte[], java.io.Serializable] */
    public Serializable b(ResolveRequest resolveRequest, onm onmVar) {
        bqb bqbVar;
        long jB;
        Object objA;
        sy21 sy21Var;
        Object obj;
        n811 n811Var;
        long j;
        Throwable thA;
        Object m231Var;
        Object obj2;
        int i;
        Throwable thA2;
        yqg yqgVar = (yqg) this.e;
        if (onmVar instanceof bqb) {
            bqbVar = (bqb) onmVar;
            int i2 = bqbVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bqbVar.g = i2 - Integer.MIN_VALUE;
            } else {
                bqbVar = new bqb(this, onmVar);
            }
        } else {
            bqbVar = new bqb(this, onmVar);
        }
        Object obj3 = bqbVar.e;
        int i3 = bqbVar.g;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(obj3);
            jB = yqgVar.b();
            i24 i24Var = new i24(this, resolveRequest, (lnm) null, (byte) 14);
            bqbVar.c = jB;
            bqbVar.g = 1;
            objA = a(i24Var, bqbVar);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            jB = bqbVar.c;
            hm5.M(obj3);
            objA = ((e331) obj3).a;
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = bqbVar.d;
            n811Var = bqbVar.b;
            sy21Var = bqbVar.a;
            hm5.M(obj3);
            obj = ((e331) obj3).a;
            j = j2;
        }
        thA = e331.a(obj);
        if (thA == null) {
            m231Var = ((e331) obj).a;
        } else {
            m231Var = new m231(thA);
        }
        obj2 = m231Var;
        lo9 lo9Var = (lo9) this.f;
        if (sy21Var != null) {
            i = sy21Var.a.d;
        } else {
            i = 0;
        }
        lo9Var.l(obj2, i, n811Var.a, j, (xav0) this.d);
        thA2 = e331.a(obj2);
        if (thA2 == null) {
            return ((ResolveResponse) obj2).o().toByteArray();
        }
        Logger.l(thA2, "Bootstrap RCS fetch failed", new Object[0]);
        return new byte[0];
        long jB2 = yqgVar.b() - jB;
        sy21Var = (sy21) (objA instanceof m231 ? null : objA);
        n811 n811Var2 = new n811();
        l24 l24Var = new l24(objA, n811Var2, this, (lnm) null);
        bqbVar.a = sy21Var;
        bqbVar.b = n811Var2;
        bqbVar.c = jB;
        bqbVar.d = jB2;
        bqbVar.g = 2;
        Object objA2 = a(l24Var, bqbVar);
        if (objA2 != d9nVar) {
            obj = objA2;
            n811Var = n811Var2;
            j = jB2;
            thA = e331.a(obj);
            if (thA == null) {
                m231Var = ((e331) obj).a;
            } else {
                m231Var = new m231(thA);
            }
            obj2 = m231Var;
            lo9 lo9Var2 = (lo9) this.f;
            if (sy21Var != null) {
                i = sy21Var.a.d;
            } else {
                i = 0;
            }
            lo9Var2.l(obj2, i, n811Var.a, j, (xav0) this.d);
            thA2 = e331.a(obj2);
            if (thA2 == null) {
                return ((ResolveResponse) obj2).o().toByteArray();
            }
            Logger.l(thA2, "Bootstrap RCS fetch failed", new Object[0]);
            return new byte[0];
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:98:0x0188  */
    public Object c(j120 j120Var, onm onmVar) {
        cqb cqbVar;
        j120 j120Var2;
        upb upbVar;
        Object obj;
        Object objA;
        j120 j120Var3;
        sy21 sy21Var;
        Throwable thA;
        int i;
        uz21 uz21Var;
        int serializedSize;
        Object obj2;
        kzr0 kzr0Var;
        List listA;
        lo9 lo9Var;
        long jB;
        String str;
        String str2;
        GetAttributesResponse getAttributesResponse;
        if (onmVar instanceof cqb) {
            cqbVar = (cqb) onmVar;
            int i2 = cqbVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cqbVar.f = i2 - Integer.MIN_VALUE;
            } else {
                cqbVar = new cqb(this, onmVar);
            }
        } else {
            cqbVar = new cqb(this, onmVar);
        }
        Object obj3 = cqbVar.d;
        int i3 = cqbVar.f;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(obj3);
            yqg yqgVar = (yqg) this.e;
            upb upbVar2 = new upb(yqgVar, (lo9) this.f);
            upbVar2.a = yqgVar.b();
            dt0 dt0Var = new dt0(this, (lnm) null, (byte) 17);
            j120Var2 = j120Var;
            cqbVar.a = j120Var2;
            cqbVar.b = upbVar2;
            cqbVar.f = 1;
            Object objA2 = a(dt0Var, cqbVar);
            if (objA2 != d9nVar) {
                upbVar = upbVar2;
                obj = objA2;
            }
            return d9nVar;
        }
        if (i3 == 1) {
            upbVar = cqbVar.b;
            j120Var2 = cqbVar.a;
            hm5.M(obj3);
            obj = ((e331) obj3).a;
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sy21Var = cqbVar.c;
            upbVar = cqbVar.b;
            j120 j120Var4 = cqbVar.a;
            hm5.M(obj3);
            objA = ((e331) obj3).a;
            j120Var3 = j120Var4;
        }
        thA = e331.a(objA);
        if (sy21Var != null || (getAttributesResponse = (GetAttributesResponse) sy21Var.b) == null) {
            if (sy21Var != null || (uz21Var = sy21Var.c) == null) {
                i = 0;
            } else {
                long jD = uz21Var.d();
                if (jD < 0) {
                    jD = 0;
                }
                serializedSize = (int) jD;
            }
            if (objA instanceof m231) {
                obj2 = null;
            } else {
                obj2 = objA;
            }
            kzr0Var = (kzr0) obj2;
            if (kzr0Var != null) {
                listA = kzr0Var.a();
            } else {
                listA = z6x.a;
            }
            lo9Var = (lo9) upbVar.c;
            jB = ((yqg) upbVar.b).b() - upbVar.a;
            if (!(thA instanceof SocketTimeoutException) || ((sy21Var != null && sy21Var.a.d == 504) || (sy21Var != null && sy21Var.a.d == 408))) {
                lo9Var.o(jB, sy21Var != null ? Integer.valueOf(sy21Var.a.d) : null, j120Var3);
                return objA;
            }
            if (sy21Var != null) {
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0) {
                    lo9.m(lo9Var, jB, ry21Var.d, i, "invalid_nebula_payload", ry21Var.c, j120Var3);
                    return objA;
                }
            }
            if (sy21Var != null && sy21Var.b == null) {
                lo9.m(lo9Var, jB, sy21Var.a.d, i, "invalid_nebula_payload", "Body is null", j120Var3);
                return objA;
            }
            if (thA == null) {
                if (sy21Var != null) {
                    lo9Var.n(jB, sy21Var.a.d, i, j120Var3, z0o1.v(listA));
                }
                return objA;
            }
            Logger.e(thA, "There was an error when fetching Bootstrap Product State.", new Object[0]);
            int i4 = sy21Var != null ? sy21Var.a.d : -1;
            if (!(thA instanceof qpb)) {
                if (!thA.equals(rpb.a) && !thA.equals(ppb.a)) {
                    Iterator it = z561.c0(zmb.a1, thA).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = "unknown";
                        } else if (((Throwable) it.next()) instanceof InvalidProtocolBufferException) {
                        }
                    }
                }
                str = "invalid_nebula_payload";
                lo9.m(lo9Var, jB, i4, i, str, thA.getMessage(), j120Var3);
                return objA;
            }
            str2 = "no_product_state";
            str = str2;
            lo9.m(lo9Var, jB, i4, i, str, thA.getMessage(), j120Var3);
            return objA;
        }
        serializedSize = getAttributesResponse.getSerializedSize();
        i = serializedSize;
        if (objA instanceof m231) {
            obj2 = null;
        } else {
            obj2 = objA;
        }
        kzr0Var = (kzr0) obj2;
        if (kzr0Var != null) {
            listA = kzr0Var.a();
        } else {
            listA = z6x.a;
        }
        lo9Var = (lo9) upbVar.c;
        jB = ((yqg) upbVar.b).b() - upbVar.a;
        if (thA instanceof SocketTimeoutException) {
        }
        lo9Var.o(jB, sy21Var != null ? Integer.valueOf(sy21Var.a.d) : null, j120Var3);
        return objA;
        sy21 sy21Var2 = (sy21) (obj instanceof m231 ? null : obj);
        ro8 ro8Var = new ro8(obj, (lnm) null, (byte) 1);
        cqbVar.a = j120Var2;
        cqbVar.b = upbVar;
        cqbVar.c = sy21Var2;
        cqbVar.f = 2;
        objA = a(ro8Var, cqbVar);
        if (objA != d9nVar) {
            j120Var3 = j120Var2;
            sy21Var = sy21Var2;
            thA = e331.a(objA);
            if (sy21Var != null) {
                if (sy21Var != null) {
                }
                i = 0;
            } else {
                if (sy21Var != null) {
                }
                i = 0;
            }
            if (objA instanceof m231) {
                obj2 = null;
            } else {
                obj2 = objA;
            }
            kzr0Var = (kzr0) obj2;
            if (kzr0Var != null) {
                listA = kzr0Var.a();
            } else {
                listA = z6x.a;
            }
            lo9Var = (lo9) upbVar.c;
            jB = ((yqg) upbVar.b).b() - upbVar.a;
            if (thA instanceof SocketTimeoutException) {
            }
            lo9Var.o(jB, sy21Var != null ? Integer.valueOf(sy21Var.a.d) : null, j120Var3);
            return objA;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(int i, byte[] bArr, onm onmVar) {
        dqb dqbVar;
        Object objA;
        if (onmVar instanceof dqb) {
            dqbVar = (dqb) onmVar;
            int i2 = dqbVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dqbVar.c = i2 - Integer.MIN_VALUE;
            } else {
                dqbVar = new dqb(this, onmVar);
            }
        } else {
            dqbVar = new dqb(this, onmVar);
        }
        Object obj = dqbVar.a;
        int i3 = dqbVar.c;
        if (i3 == 0) {
            hm5.M(obj);
            if (200 > i || i >= 300) {
                return new m231(new IllegalStateException(f4i1.c(i, "HTTP ")));
            }
            if (bArr == null) {
                return new m231(new IllegalStateException("Missing resolve response body"));
            }
            ro8 ro8Var = new ro8(bArr, (lnm) null, (byte) 2);
            dqbVar.c = 1;
            objA = a(ro8Var, dqbVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        Throwable thA = e331.a(objA);
        if (thA != null) {
            return new m231(thA);
        }
        ResolveResponse resolveResponse = (ResolveResponse) objA;
        return !resolveResponse.p() ? new m231(new IllegalStateException("Missing configuration in resolve response")) : resolveResponse;
    }

    public fqb(lik1 lik1Var, String str, ywc0 ywc0Var, gn10 gn10Var, i4q i4qVar, yhm yhmVar, boolean z) {
        this.b = lik1Var;
        this.c = str;
        this.d = ywc0Var;
        this.e = gn10Var;
        this.f = i4qVar;
        this.g = yhmVar;
        this.a = z;
    }
}
