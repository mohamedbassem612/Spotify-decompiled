package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class nsm0 extends tv30 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm0(en31 en31Var, byte b) {
        super(2, en31Var, fn31.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        this.a = b;
        switch (b) {
            case 21:
                super(2, en31Var, fn31.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
                break;
            default:
                break;
        }
    }

    private final Object e(Object obj, Object obj2) {
        Object next;
        String str;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        lr51 lr51Var = (lr51) ((lyc) this).receiver;
        q120 q120Var = lr51Var.f;
        synchronized (q120Var) {
            try {
                b7x b7xVar = (Map) o7h.B0(q120Var.a.values());
                if (b7xVar == null) {
                    b7xVar = b7x.a;
                }
                Iterator it = b7xVar.entrySet().iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    List<j220> list = (List) ((Map.Entry) next).getValue();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (j220 j220Var : list) {
                            float f = j220Var.a;
                            if (fFloatValue <= j220Var.c && f <= fFloatValue) {
                                float f2 = j220Var.b;
                                if (fFloatValue2 <= j220Var.d && f2 <= fFloatValue2) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                str = entry != null ? (String) entry.getKey() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zA = false;
        if (str != null) {
            List list2 = lr51Var.c.a;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (u890.j(((c220) it2.next()).a, str)) {
                        zA = lr51Var.m.a(str);
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(zA);
    }

    private final Object n(Object obj, Object obj2) {
        int i;
        Integer numC0;
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((i981) ((lyc) this).receiver).getClass();
        int iIntValue = (str == null || (numC0 = nhc1.c0(str)) == null) ? 0 : numC0.intValue();
        if (zBooleanValue) {
            i = iIntValue | 1;
        } else {
            if (zBooleanValue) {
                eg.o();
                return null;
            }
            i = iIntValue & (-2);
        }
        return String.valueOf(i);
    }

    private final Object s(Object obj, Object obj2) {
        u6a1 u6a1Var = (u6a1) obj;
        q6a1 q6a1Var = (q6a1) obj2;
        ((w6a1) ((lyc) this).receiver).getClass();
        ho70 ho70Var = (ho70) o7h.s0(q6a1Var.a.d);
        String str = ho70Var != null ? ho70Var.b : null;
        List<hwm> listS = sto1.s(q6a1Var.b);
        ArrayList arrayList = new ArrayList(q7h.U(listS, 10));
        for (hwm hwmVar : listS) {
            arrayList.add(new byg(hwmVar.a, hwmVar.c, u6a1Var.a, hwmVar.b));
        }
        return new v6a1(u6a1Var, str, mqo1.F(o7h.a1(arrayList, new be21((byte) 12))));
    }

    private final Object t(Object obj, Object obj2) {
        y7a1 w7a1Var;
        up70 up70VarA;
        String str;
        up70 up70VarA2;
        io70 io70Var;
        String str2;
        l7a1 l7a1Var = (l7a1) obj;
        o7a1 o7a1Var = (o7a1) obj2;
        ((s7a1) ((lyc) this).receiver).getClass();
        p7a1 p7a1Var = o7a1Var.a;
        List listS = sto1.s(p7a1Var.c.a);
        List list = listS;
        int iS = zno1.s(q7h.U(list, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj3 : list) {
            linkedHashMap.put(((hwm) obj3).c, obj3);
        }
        pp70 pp70Var = p7a1Var.b.a.b;
        u7h u7hVar = pp70Var != null ? new u7h(pp70Var.c.a.b.a()) : null;
        List<n7a1> list2 = o7a1Var.c;
        ArrayList arrayList = new ArrayList();
        for (n7a1 n7a1Var : list2) {
            Set set = s4b1.f;
            String str3 = n7a1Var.a;
            xkk1 xkk1Var = n7a1Var.c;
            jo70 jo70Var = n7a1Var.b;
            int iOrdinal = uic.x(str3).c.ordinal();
            vp70 vp70Var = vp70.d;
            String str4 = "";
            if (iOrdinal == 44) {
                hwm hwmVar = (hwm) linkedHashMap.get(str3);
                if (jo70Var != null && (str = jo70Var.a) != null) {
                    str4 = str;
                } else if (hwmVar != null) {
                    str4 = hwmVar.a;
                }
                w7a1Var = new w7a1(str4, str3, mqo1.F(hwmVar != null ? hwmVar.b : z6x.a), (xkk1Var == null || (up70VarA = xkk1Var.a.a(vp70Var)) == null) ? null : up70VarA.a.a);
            } else if (iOrdinal != 781) {
                w7a1Var = null;
            } else {
                if (jo70Var != null && (io70Var = jo70Var.e) != null && (str2 = io70Var.a) != null) {
                    str4 = str2;
                }
                w7a1Var = new x7a1(str4, str3, jo70Var != null ? jo70Var.b : null, (xkk1Var == null || (up70VarA2 = xkk1Var.a.a(vp70Var)) == null) ? null : up70VarA2.a.a);
            }
            if (w7a1Var != null) {
                arrayList.add(w7a1Var);
            }
        }
        c9 c9VarF = mqo1.F(arrayList);
        int i = 0;
        if (c9VarF == null || !c9VarF.isEmpty()) {
            ListIterator listIterator = c9VarF.listIterator(0);
            while (listIterator.hasNext()) {
                if ((((y7a1) listIterator.next()) instanceof x7a1) && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        return new a8a1(l7a1Var.a, p7a1Var.a.a, c9VarF, u7hVar, listS.size(), Math.max(o7a1Var.b, i));
    }

    /* JADX WARN: Code duplicated, block: B:233:0x0427  */
    /* JADX WARN: Code duplicated, block: B:292:0x0526 A[PHI: r2 r39
      0x0526: PHI (r2v101 java.lang.String) = (r2v82 java.lang.String), (r2v103 java.lang.String) binds: [B:295:0x0530, B:290:0x0523] A[DONT_GENERATE, DONT_INLINE]
      0x0526: PHI (r39v3 java.lang.String) = (r39v0 java.lang.String), (r39v4 java.lang.String) binds: [B:295:0x0530, B:290:0x0523] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:293:0x0529 A[PHI: r39
      0x0529: PHI (r39v1 java.lang.String) = (r39v0 java.lang.String), (r39v4 java.lang.String), (r39v4 java.lang.String) binds: [B:295:0x0530, B:288:0x051d, B:290:0x0523] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:382:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:460:0x080f A[PHI: r17
      0x080f: PHI (r17v40 java.lang.String) = (r17v17 java.lang.String), (r17v15 java.lang.String) binds: [B:474:0x0841, B:458:0x080c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:521:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:539:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:648:0x0b7a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r17v10 java.lang.Object, still in use, count: 2, list:
          (r17v10 java.lang.Object) from 0x0b76: PHI (r17 I:??) = (r17v7 java.lang.Object), (r17v10 java.lang.Object) binds: [B:645:0x0b74, B:737:0x0b76] A[DONT_GENERATE, DONT_INLINE]
          (r17v10 java.lang.Object) from 0x0b63: CHECK_CAST (p.cbu0) (r17v10 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 3176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nsm0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm0(Object obj) {
        super(2, obj, ir51.class, "getOrPut", "getOrPut(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/spotify/contentdelivery/download/SegmentFileStreamer;", 0);
        this.a = (byte) 22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm0(utm0 utm0Var) {
        super(2, utm0Var, utm0.class, "acquireSinglePlayerOrNull", "acquireSinglePlayerOrNull(Lcom/spotify/multiplayer/multiplayer/Token;Lcom/spotify/multiplayer/multiplayer/TokenPool;)Lcom/spotify/multiplayer/multiplayerapi/SinglePlayer;", 0);
        this.a = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm0(wiy0 wiy0Var) {
        super(2, wiy0Var, wiy0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        this.a = (byte) 12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm0(rq01 rq01Var) {
        super(2, rq01Var, rq01.class, "stateMapper", "stateMapper(Lcom/spotify/home/evopage/element/recents/RecentsCarouselElement$RecentsCarouselElementProps;Lcom/spotify/home/evopage/element/recents/RecentsCarouselElement$ExternalState;)Lcom/spotify/home/evopage/element/imagelinks/models/State;", 0);
        this.a = (byte) 16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm0(gd11 gd11Var) {
        super(2, gd11Var, gd11.class, "mapState", "mapState(Lcom/spotify/reflection/reflectionelement/api/ReflectionElement$Props;Lcom/spotify/reflection/reflectionelement/api/ReflectionElement$Traits;)Lcom/spotify/reflection/reflectionelement/api/ReflectionElement$State;", 0);
        this.a = (byte) 17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm0(ym21 ym21Var) {
        super(2, ym21Var, ym21.class, "setProvenanceId", "setProvenanceId(Ljava/lang/String;Ljava/lang/String;)V", 0);
        this.a = (byte) 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsm0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
