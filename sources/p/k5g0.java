package p;

import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k5g0 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ String O0;
    public final /* synthetic */ boolean P0;
    public /* synthetic */ Object X;
    public final /* synthetic */ l5g0 Y;
    public final /* synthetic */ String Z;
    public String a;
    public vgn0 b;
    public Object c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5g0(l5g0 l5g0Var, String str, boolean z, String str2, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = l5g0Var;
        this.Z = str;
        this.N0 = z;
        this.O0 = str2;
        this.P0 = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        k5g0 k5g0Var = new k5g0(this.Y, this.Z, this.N0, this.O0, this.P0, lnmVar);
        k5g0Var.X = obj;
        return k5g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x017a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x0193 A[PHI: r0 r10
      0x0193: PHI (r0v10 java.lang.String) = (r0v8 java.lang.String), (r0v40 java.lang.String) binds: [B:77:0x0190, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v0 java.lang.String) binds: [B:77:0x0190, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0138: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:313), block:B:60:0x0138 */
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        d6g0 d6g0Var;
        String str2;
        String str3;
        boolean z;
        String str4;
        boolean z2;
        vgn0 vgn0Var;
        String str5;
        int i;
        Object objPutIfAbsent;
        vgn0 vgn0Var2;
        Serializable serializableG;
        boolean z3;
        String str6;
        int i2;
        e6g0 e6g0Var;
        l5g0 l5g0Var = this.Y;
        ConcurrentHashMap concurrentHashMap = l5g0Var.f;
        vr20 vr20Var = (vr20) this.X;
        byte b = this.t;
        Serializable serializable = rih1.a;
        boolean z4 = this.N0;
        String str7 = this.Z;
        String str8 = null;
        Serializable serializable2 = d9n.a;
        try {
            try {
                try {
                    switch (b) {
                        case 0:
                            hm5.M(obj);
                            string = UUID.randomUUID().toString();
                            try {
                                Object objA = concurrentHashMap.get(str7);
                                if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str7, (objA = ygn0.a()))) != null) {
                                    objA = objPutIfAbsent;
                                }
                                vgn0 vgn0Var3 = (vgn0) objA;
                                str3 = this.O0;
                                z = this.P0;
                                this.X = vr20Var;
                                this.a = string;
                                this.b = vgn0Var3;
                                this.c = l5g0Var;
                                this.d = str3;
                                this.e = str7;
                                this.f = z4;
                                this.g = z;
                                this.h = 0;
                                this.t = (byte) 1;
                                if (vgn0Var3.a(this) != serializable2) {
                                    str4 = string;
                                    z2 = z4;
                                    vgn0Var = vgn0Var3;
                                    str5 = str7;
                                    i = 0;
                                    try {
                                        ezb1 ezb1Var = l5g0Var.a;
                                        this.X = vr20Var;
                                        this.a = str4;
                                        this.b = vgn0Var;
                                        this.c = str5;
                                        vgn0Var2 = vgn0Var;
                                        try {
                                            this.d = null;
                                            this.e = null;
                                            this.f = z2;
                                            this.g = z;
                                            this.h = i;
                                            this.i = 0;
                                            this.t = (byte) 2;
                                            serializableG = ((va40) ezb1Var.b).g(str5, Collections.singletonMap(str3, Boolean.valueOf(z2)), this);
                                            if (serializableG != serializable2) {
                                                serializableG = serializable;
                                            }
                                            if (serializableG != serializable2) {
                                                vgn0Var = vgn0Var2;
                                                z3 = z2;
                                                str6 = str5;
                                                i2 = 0;
                                                try {
                                                    e6g0Var = new e6g0(str6, z3, str4, z);
                                                    this.X = vr20Var;
                                                    this.a = str4;
                                                    this.b = vgn0Var;
                                                    this.c = null;
                                                    this.h = i;
                                                    this.i = i2;
                                                    this.t = (byte) 3;
                                                    if (vr20Var.emit(e6g0Var, this) != serializable2) {
                                                        str8 = null;
                                                        vgn0Var.c(str8);
                                                        concurrentHashMap.remove(str7);
                                                        str2 = str4;
                                                        if (!z4) {
                                                            this.X = vr20Var;
                                                            this.a = str2;
                                                            str8 = null;
                                                            this.b = null;
                                                            this.t = (byte) 5;
                                                            if (hap1.i(4000L, this) != serializable2) {
                                                                m6g0 m6g0Var = new m6g0(str7, str2);
                                                                this.X = str8;
                                                                this.a = str8;
                                                                this.t = (byte) 6;
                                                                if (vr20Var.emit(m6g0Var, this) == serializable2) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    str8 = null;
                                                    vgn0Var.c(str8);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            vgn0Var = vgn0Var2;
                                            str8 = null;
                                            vgn0Var.c(str8);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                Logger.e(e, "Error updating blocked state for entity: " + str7, new Object[0]);
                                d6g0Var = new d6g0(str7, z4);
                                this.X = vr20Var;
                                this.a = string;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.t = (byte) 4;
                                if (vr20Var.emit(d6g0Var, this) != serializable2) {
                                    str2 = string;
                                    concurrentHashMap.remove(str7);
                                    if (!z4) {
                                        this.X = vr20Var;
                                        this.a = str2;
                                        str8 = null;
                                        this.b = null;
                                        this.t = (byte) 5;
                                        if (hap1.i(4000L, this) != serializable2) {
                                            m6g0 m6g0Var2 = new m6g0(str7, str2);
                                            this.X = str8;
                                            this.a = str8;
                                            this.t = (byte) 6;
                                            if (vr20Var.emit(m6g0Var2, this) == serializable2) {
                                            }
                                        }
                                    }
                                }
                            }
                        case 1:
                            int i3 = this.h;
                            boolean z5 = this.g;
                            boolean z6 = this.f;
                            String str9 = this.e;
                            str3 = this.d;
                            l5g0 l5g0Var2 = (l5g0) this.c;
                            vgn0 vgn0Var4 = this.b;
                            String str10 = this.a;
                            try {
                                hm5.M(obj);
                                i = i3;
                                l5g0Var = l5g0Var2;
                                z2 = z6;
                                z = z5;
                                vgn0Var = vgn0Var4;
                                str5 = str9;
                                str4 = str10;
                                ezb1 ezb1Var2 = l5g0Var.a;
                                this.X = vr20Var;
                                this.a = str4;
                                this.b = vgn0Var;
                                this.c = str5;
                                vgn0Var2 = vgn0Var;
                                this.d = null;
                                this.e = null;
                                this.f = z2;
                                this.g = z;
                                this.h = i;
                                this.i = 0;
                                this.t = (byte) 2;
                                serializableG = ((va40) ezb1Var2.b).g(str5, Collections.singletonMap(str3, Boolean.valueOf(z2)), this);
                                if (serializableG != serializable2) {
                                    serializableG = serializable;
                                }
                                if (serializableG != serializable2) {
                                    vgn0Var = vgn0Var2;
                                    z3 = z2;
                                    str6 = str5;
                                    i2 = 0;
                                    e6g0Var = new e6g0(str6, z3, str4, z);
                                    this.X = vr20Var;
                                    this.a = str4;
                                    this.b = vgn0Var;
                                    this.c = null;
                                    this.h = i;
                                    this.i = i2;
                                    this.t = (byte) 3;
                                    if (vr20Var.emit(e6g0Var, this) != serializable2) {
                                        str8 = null;
                                        vgn0Var.c(str8);
                                        concurrentHashMap.remove(str7);
                                        str2 = str4;
                                        if (!z4) {
                                            this.X = vr20Var;
                                            this.a = str2;
                                            str8 = null;
                                            this.b = null;
                                            this.t = (byte) 5;
                                            if (hap1.i(4000L, this) != serializable2) {
                                                m6g0 m6g0Var3 = new m6g0(str7, str2);
                                                this.X = str8;
                                                this.a = str8;
                                                this.t = (byte) 6;
                                                if (vr20Var.emit(m6g0Var3, this) == serializable2) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                string = str10;
                                Logger.e(e, "Error updating blocked state for entity: " + str7, new Object[0]);
                                d6g0Var = new d6g0(str7, z4);
                                this.X = vr20Var;
                                this.a = string;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.t = (byte) 4;
                                if (vr20Var.emit(d6g0Var, this) != serializable2) {
                                    str2 = string;
                                    concurrentHashMap.remove(str7);
                                    if (!z4) {
                                        this.X = vr20Var;
                                        this.a = str2;
                                        str8 = null;
                                        this.b = null;
                                        this.t = (byte) 5;
                                        if (hap1.i(4000L, this) != serializable2) {
                                            m6g0 m6g0Var4 = new m6g0(str7, str2);
                                            this.X = str8;
                                            this.a = str8;
                                            this.t = (byte) 6;
                                            if (vr20Var.emit(m6g0Var4, this) == serializable2) {
                                            }
                                        }
                                    }
                                }
                            }
                        case 2:
                            i2 = this.i;
                            int i4 = this.h;
                            boolean z7 = this.g;
                            z3 = this.f;
                            str6 = (String) this.c;
                            vgn0 vgn0Var5 = this.b;
                            String str11 = this.a;
                            try {
                                hm5.M(obj);
                                str4 = str11;
                                z = z7;
                                i = i4;
                                vgn0Var = vgn0Var5;
                                e6g0Var = new e6g0(str6, z3, str4, z);
                                this.X = vr20Var;
                                this.a = str4;
                                this.b = vgn0Var;
                                this.c = null;
                                this.h = i;
                                this.i = i2;
                                this.t = (byte) 3;
                                if (vr20Var.emit(e6g0Var, this) != serializable2) {
                                    str8 = null;
                                    vgn0Var.c(str8);
                                    concurrentHashMap.remove(str7);
                                    str2 = str4;
                                    if (!z4) {
                                        this.X = vr20Var;
                                        this.a = str2;
                                        str8 = null;
                                        this.b = null;
                                        this.t = (byte) 5;
                                        if (hap1.i(4000L, this) != serializable2) {
                                            m6g0 m6g0Var5 = new m6g0(str7, str2);
                                            this.X = str8;
                                            this.a = str8;
                                            this.t = (byte) 6;
                                            if (vr20Var.emit(m6g0Var5, this) == serializable2) {
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                vgn0Var = vgn0Var5;
                                str8 = null;
                                vgn0Var.c(str8);
                                throw th;
                            }
                        case 3:
                            vgn0Var = this.b;
                            str4 = this.a;
                            try {
                                hm5.M(obj);
                                vgn0Var.c(str8);
                                concurrentHashMap.remove(str7);
                                str2 = str4;
                                if (!z4) {
                                    this.X = vr20Var;
                                    this.a = str2;
                                    str8 = null;
                                    this.b = null;
                                    this.t = (byte) 5;
                                    if (hap1.i(4000L, this) != serializable2) {
                                        m6g0 m6g0Var6 = new m6g0(str7, str2);
                                        this.X = str8;
                                        this.a = str8;
                                        this.t = (byte) 6;
                                        if (vr20Var.emit(m6g0Var6, this) == serializable2) {
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                vgn0Var.c(str8);
                                throw th;
                            }
                        case 4:
                            Exception exc = this.b;
                            str2 = this.a;
                            hm5.M(obj);
                            concurrentHashMap.remove(str7);
                            if (!z4) {
                                this.X = vr20Var;
                                this.a = str2;
                                str8 = null;
                                this.b = null;
                                this.t = (byte) 5;
                                if (hap1.i(4000L, this) != serializable2) {
                                    m6g0 m6g0Var7 = new m6g0(str7, str2);
                                    this.X = str8;
                                    this.a = str8;
                                    this.t = (byte) 6;
                                    if (vr20Var.emit(m6g0Var7, this) == serializable2) {
                                    }
                                }
                            }
                        case 5:
                            str2 = this.a;
                            hm5.M(obj);
                            m6g0 m6g0Var8 = new m6g0(str7, str2);
                            this.X = str8;
                            this.a = str8;
                            this.t = (byte) 6;
                            return vr20Var.emit(m6g0Var8, this) == serializable2 ? serializable2 : serializable;
                        case 6:
                            hm5.M(obj);
                        default:
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th6) {
                    concurrentHashMap.remove(str7);
                    throw th6;
                }
            } catch (Exception e3) {
                e = e3;
                string = str;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
