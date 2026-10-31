package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.inappuserfeedback.feedbackgenerator.FeedbackReportGeneratorException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ox10 extends a8d1 implements vu30 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ vgr X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public vgr a;
    public String b;
    public vgr c;
    public xkg0 d;
    public xkg0 e;
    public boolean f;
    public boolean g;
    public int h;
    public byte i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox10(vgr vgrVar, boolean z, boolean z2, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.X = vgrVar;
        this.Y = z;
        this.Z = z2;
        this.N0 = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ox10 ox10Var = new ox10(this.X, this.Y, this.Z, this.N0, lnmVar);
        ox10Var.t = obj;
        return ox10Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0167 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7 A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010f A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139 A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013e A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0142 A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0148 A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x016d A[Catch: all -> 0x0037, CancellationException -> 0x0191, TryCatch #3 {CancellationException -> 0x0191, all -> 0x0037, blocks: (B:8:0x002f, B:51:0x0133, B:53:0x0139, B:58:0x0148, B:60:0x014d, B:64:0x0158, B:65:0x0167, B:67:0x016d, B:71:0x017f, B:73:0x018c, B:54:0x013e, B:56:0x0142, B:15:0x004a, B:29:0x00c8, B:31:0x00ce, B:36:0x00dd, B:39:0x00f1, B:42:0x00f8, B:44:0x00fd, B:45:0x0100, B:47:0x010f, B:32:0x00d3, B:34:0x00d7, B:18:0x0061, B:25:0x009f, B:21:0x0076), top: B:93:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x019f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x017b A[SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        String m231Var;
        Throwable thA;
        Throwable thA2;
        String str;
        Object objK;
        vgr vgrVar;
        vgr vgrVar2;
        boolean z;
        boolean z2;
        int i;
        Object objK2;
        int i2;
        boolean z3;
        String str2;
        p1s0 p1s0Var;
        String str3;
        xkg0 xkg0Var;
        Object objK3;
        xkg0 xkg0Var2;
        xkg0 xkg0Var3;
        boolean z4;
        LinkedHashMap linkedHashMapB;
        kx10 kx10Var;
        xai1 xai1Var;
        byte b = this.i;
        kx10 kx10Var2 = kx10.PROPERTY_USER_ID;
        kx10 kx10Var3 = kx10.PROPERTY_PARTNER_ID;
        kx10 kx10Var4 = kx10.PROPERTY_USERNAME;
        String str4 = null;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                vgr vgrVar3 = this.X;
                boolean z5 = this.Y;
                boolean z6 = this.Z;
                str = this.N0;
                mr20 mr20VarA = ((ov20) vgrVar3.h).a("employee", false);
                this.t = null;
                this.a = vgrVar3;
                this.b = str;
                this.c = vgrVar3;
                this.f = z5;
                this.g = z6;
                this.h = 0;
                this.i = (byte) 1;
                objK = b5p1.k(mr20VarA, this);
                if (objK != d9nVar) {
                    vgrVar = vgrVar3;
                    vgrVar2 = vgrVar;
                    z = z5;
                    z2 = z6;
                    i = 0;
                }
                return d9nVar;
            }
            if (b == 1) {
                i = this.h;
                boolean z7 = this.g;
                boolean z8 = this.f;
                vgr vgrVar4 = this.c;
                str = this.b;
                vgr vgrVar5 = this.a;
                hm5.M(obj);
                vgrVar2 = vgrVar5;
                vgrVar = vgrVar4;
                z = z8;
                z2 = z7;
                objK = obj;
            } else {
                if (b == 2) {
                    int i3 = this.h;
                    boolean z9 = this.g;
                    boolean z10 = this.f;
                    str2 = this.b;
                    vgr vgrVar6 = this.a;
                    hm5.M(obj);
                    vgrVar2 = vgrVar6;
                    z = z10;
                    i2 = i3;
                    z3 = z9;
                    objK2 = obj;
                    p1s0Var = (s1s0) objK2;
                    if (p1s0Var instanceof p1s0) {
                        str3 = p1s0Var.a;
                    } else if (p1s0Var instanceof r1s0) {
                        str3 = ((r1s0) p1s0Var).a;
                    } else {
                        str3 = null;
                    }
                    xkg0Var = new xkg0();
                    xkg0Var.putAll(((g580) vgrVar2.d).a());
                    if (z3 && str2 != null && !ihc1.y0(str2)) {
                        xkg0Var.put(kx10Var4, str2);
                    }
                    if (str3 != null) {
                        xkg0Var.put(kx10Var3, str3);
                    }
                    xkg0Var.put(kx10.PROPERTY_IS_EMPLOYEE, String.valueOf(vgrVar2.b));
                    if (vgrVar2.b) {
                        xe01 xe01Var = ((xi61) vgrVar2.e).j;
                        this.t = null;
                        this.a = vgrVar2;
                        this.b = null;
                        this.c = null;
                        this.d = xkg0Var;
                        this.e = xkg0Var;
                        this.f = z;
                        this.g = z3;
                        this.h = i2;
                        this.i = (byte) 3;
                        objK3 = b5p1.k(xe01Var, this);
                        if (objK3 != d9nVar) {
                            xkg0Var2 = xkg0Var;
                            xkg0Var3 = xkg0Var2;
                            z4 = z;
                        }
                        return d9nVar;
                    }
                    linkedHashMapB = xkg0Var.b();
                    if (!vgrVar2.a && z) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMapB.entrySet()) {
                            kx10Var = (kx10) entry.getKey();
                            if (kx10Var == kx10Var4 && kx10Var != kx10Var3 && kx10Var != kx10Var2) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        linkedHashMapB = linkedHashMap;
                    }
                    m231Var = vgr.p(linkedHashMapB, z3);
                    thA = e331.a(m231Var);
                    if (thA != null) {
                        Logger.d(l1d.m("Failed to retrieve user details: ", thA.getMessage()), new Object[0]);
                    }
                    thA2 = e331.a(m231Var);
                    if (thA2 != null) {
                        try {
                            throw new FeedbackReportGeneratorException("Failed to retrieve user details", thA2);
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                    }
                    return new e331(m231Var);
                }
                if (b != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = this.g;
                z4 = this.f;
                xkg0Var2 = this.e;
                xkg0Var3 = this.d;
                c9n c9nVar = this.b;
                vgr vgrVar7 = this.a;
                hm5.M(obj);
                vgrVar2 = vgrVar7;
                objK3 = obj;
            }
            xai1Var = (abi1) objK3;
            if (xai1Var instanceof xai1) {
                str4 = xai1Var.a;
            } else if (xai1Var instanceof zai1) {
                str4 = ((zai1) xai1Var).a;
            }
            if (str4 != null) {
                xkg0Var2.put(kx10Var2, str4);
            }
            z = z4;
            xkg0Var = xkg0Var3;
            linkedHashMapB = xkg0Var.b();
            if (!vgrVar2.a) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (r0.hasNext()) {
                    kx10Var = (kx10) entry.getKey();
                    if (kx10Var == kx10Var4) {
                    }
                }
                linkedHashMapB = linkedHashMap2;
            }
            m231Var = vgr.p(linkedHashMapB, z3);
            thA = e331.a(m231Var);
            if (thA != null) {
                Logger.d(l1d.m("Failed to retrieve user details: ", thA.getMessage()), new Object[0]);
            }
            thA2 = e331.a(m231Var);
            if (thA2 != null) {
                throw new FeedbackReportGeneratorException("Failed to retrieve user details", thA2);
            }
            return new e331(m231Var);
            vgrVar.b = u890.j(objK, Boolean.TRUE);
            xe01 xe01Var2 = ((xi61) vgrVar2.e).i;
            this.t = null;
            this.a = vgrVar2;
            this.b = str;
            this.c = null;
            this.f = z;
            this.g = z2;
            this.h = i;
            this.i = (byte) 2;
            objK2 = b5p1.k(xe01Var2, this);
            if (objK2 != d9nVar) {
                i2 = i;
                z3 = z2;
                str2 = str;
                p1s0Var = (s1s0) objK2;
                if (p1s0Var instanceof p1s0) {
                    str3 = p1s0Var.a;
                } else if (p1s0Var instanceof r1s0) {
                    str3 = ((r1s0) p1s0Var).a;
                } else {
                    str3 = null;
                }
                xkg0Var = new xkg0();
                xkg0Var.putAll(((g580) vgrVar2.d).a());
                if (z3) {
                    xkg0Var.put(kx10Var4, str2);
                }
                if (str3 != null) {
                    xkg0Var.put(kx10Var3, str3);
                }
                xkg0Var.put(kx10.PROPERTY_IS_EMPLOYEE, String.valueOf(vgrVar2.b));
                if (vgrVar2.b) {
                    xe01 xe01Var3 = ((xi61) vgrVar2.e).j;
                    this.t = null;
                    this.a = vgrVar2;
                    this.b = null;
                    this.c = null;
                    this.d = xkg0Var;
                    this.e = xkg0Var;
                    this.f = z;
                    this.g = z3;
                    this.h = i2;
                    this.i = (byte) 3;
                    objK3 = b5p1.k(xe01Var3, this);
                    if (objK3 != d9nVar) {
                        xkg0Var2 = xkg0Var;
                        xkg0Var3 = xkg0Var2;
                        z4 = z;
                        xai1Var = (abi1) objK3;
                        if (xai1Var instanceof xai1) {
                            str4 = xai1Var.a;
                        } else if (xai1Var instanceof zai1) {
                            str4 = ((zai1) xai1Var).a;
                        }
                        if (str4 != null) {
                            xkg0Var2.put(kx10Var2, str4);
                        }
                        z = z4;
                        xkg0Var = xkg0Var3;
                    }
                }
                linkedHashMapB = xkg0Var.b();
                if (!vgrVar2.a) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    while (r0.hasNext()) {
                        kx10Var = (kx10) entry.getKey();
                        if (kx10Var == kx10Var4) {
                        }
                    }
                    linkedHashMapB = linkedHashMap3;
                }
                m231Var = vgr.p(linkedHashMapB, z3);
                thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.d(l1d.m("Failed to retrieve user details: ", thA.getMessage()), new Object[0]);
                }
                thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    throw new FeedbackReportGeneratorException("Failed to retrieve user details", thA2);
                }
                return new e331(m231Var);
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
    }
}
