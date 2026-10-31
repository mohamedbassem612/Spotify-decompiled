package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v08 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v08(int i) {
        super(i);
        this.a = (byte) 8;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        o5m0 o5m0Var = (o5m0) obj;
        v130 v130Var = (v130) obj3;
        r6h1 r6h1Var = o5m0Var.a;
        y6h1 y6h1Var = o5m0Var.b;
        int iOrdinal = ((r130) obj4).ordinal();
        b7x b7xVar = b7x.a;
        if (iOrdinal == 0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal == 1) {
            return o5m0Var.e();
        }
        if (iOrdinal == 2) {
            String str = v130Var.b;
            t130 t130Var = v130Var.c;
            if (!(t130Var instanceof t130) || !t130Var.a.b()) {
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str != null ? str : "")), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
            }
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str != null ? str : "")), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal == 3) {
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("create_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            y6h1 y6h1VarA = x6h1VarC4.a();
            String str2 = w130.b;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal != 4) {
            eg.o();
            return null;
        }
        x6h1 x6h1VarC5 = y6h1Var.c();
        x6h1VarC5.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC5.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        jal0 jal0Var = (jal0) obj;
        l8j0 l8j0Var = (n8j0) obj4;
        r6h1 r6h1Var = jal0Var.a;
        y6h1 y6h1Var = jal0Var.b;
        if (l8j0Var instanceof l8j0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            r6h1 r6h1Var2 = r6h1.c;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(r6h1Var.a);
            arrayList.add(y6h1VarA);
            return ldo.x(new r6h1(arrayList, r6h1Var.b), l8j0Var.a);
        }
        if (l8j0Var instanceof m8j0) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            r6h1 r6h1Var3 = r6h1.c;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(r6h1Var.a);
            arrayList2.add(y6h1VarA2);
            return ldo.x(new r6h1(arrayList2, r6h1Var.b), ((m8j0) l8j0Var).a);
        }
        if (l8j0Var instanceof h8j0) {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            r6h1 r6h1Var4 = r6h1.c;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(r6h1Var.a);
            arrayList3.add(y6h1VarA3);
            return ldo.x(new r6h1(arrayList3, r6h1Var.b), ((h8j0) l8j0Var).a);
        }
        if (l8j0Var instanceof i8j0) {
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("content_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            y6h1 y6h1VarA4 = x6h1VarC4.a();
            r6h1 r6h1Var5 = r6h1.c;
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(r6h1Var.a);
            arrayList4.add(y6h1VarA4);
            return ldo.x(new r6h1(arrayList4, r6h1Var.b), ((i8j0) l8j0Var).a);
        }
        if (!(l8j0Var instanceof j8j0)) {
            return null;
        }
        x6h1 x6h1VarC5 = y6h1Var.c();
        x6h1VarC5.i.add(new a7h1("link_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC5.j = false;
        y6h1 y6h1VarA5 = x6h1VarC5.a();
        r6h1 r6h1Var6 = r6h1.c;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(r6h1Var.a);
        arrayList5.add(y6h1VarA5);
        return ldo.x(new r6h1(arrayList5, r6h1Var.b), ((j8j0) l8j0Var).a);
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        u8j0 u8j0Var = (x8j0) obj4;
        y6h1 y6h1Var = ((cal0) obj).a;
        if (u8j0Var instanceof u8j0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            r6h1 r6h1Var = r6h1.c;
            r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            Button button = u8j0Var.a;
            return i0p1.x(button.getClickAction(), new g5l0(r6h1Var2, (byte) 15));
        }
        if (u8j0Var instanceof v8j0) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            r6h1 r6h1Var3 = r6h1.c;
            r6h1 r6h1Var4 = new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
            Button button2 = ((v8j0) u8j0Var).a;
            return i0p1.x(button2.getClickAction(), new g5l0(r6h1Var4, (byte) 15));
        }
        if (!(u8j0Var instanceof w8j0)) {
            return null;
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("link_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        y6h1 y6h1VarA3 = x6h1VarC3.a();
        r6h1 r6h1Var5 = r6h1.c;
        r6h1 r6h1Var6 = new r6h1(kk0.l(y6h1VarA3), (u8h1) null);
        Button button3 = ((w8j0) u8j0Var).a;
        return i0p1.x(button3.getClickAction(), new g5l0(r6h1Var6, (byte) 15));
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        cbj0 cbj0Var = (ebj0) obj4;
        y6h1 y6h1Var = ((kal0) obj).a;
        if (cbj0Var instanceof cbj0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            r6h1 r6h1Var = r6h1.c;
            r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            Button button = cbj0Var.a;
            return i0p1.x(button.getClickAction(), new g5l0(r6h1Var2, (byte) 15));
        }
        if (cbj0Var instanceof dbj0) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            r6h1 r6h1Var3 = r6h1.c;
            r6h1 r6h1Var4 = new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
            Button button2 = ((dbj0) cbj0Var).a;
            return i0p1.x(button2.getClickAction(), new g5l0(r6h1Var4, (byte) 15));
        }
        if (!(cbj0Var instanceof abj0)) {
            return null;
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("link_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        y6h1 y6h1VarA3 = x6h1VarC3.a();
        r6h1 r6h1Var5 = r6h1.c;
        r6h1 r6h1Var6 = new r6h1(kk0.l(y6h1VarA3), (u8h1) null);
        Button button3 = ((abj0) cbj0Var).a;
        return i0p1.x(button3.getClickAction(), new g5l0(r6h1Var6, (byte) 15));
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        ial0 ial0Var = (ial0) obj;
        hbj0 hbj0Var = (kbj0) obj4;
        r6h1 r6h1Var = ial0Var.a;
        y6h1 y6h1Var = ial0Var.b;
        if (hbj0Var instanceof hbj0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            r6h1 r6h1Var2 = r6h1.c;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(r6h1Var.a);
            arrayList.add(y6h1VarA);
            r6h1 r6h1Var3 = new r6h1(arrayList, r6h1Var.b);
            Button button = hbj0Var.a;
            return i0p1.x(button.getClickAction(), new g5l0(r6h1Var3, (byte) 15));
        }
        if (!(hbj0Var instanceof ibj0)) {
            return null;
        }
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        r6h1 r6h1Var4 = r6h1.c;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(r6h1Var.a);
        arrayList2.add(y6h1VarA2);
        r6h1 r6h1Var5 = new r6h1(arrayList2, r6h1Var.b);
        Button button2 = ((ibj0) hbj0Var).a;
        return i0p1.x(button2.getClickAction(), new g5l0(r6h1Var5, (byte) 15));
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        mal0 mal0Var = (mal0) obj;
        lfj0 lfj0Var = (ofj0) obj4;
        r6h1 r6h1Var = mal0Var.a;
        y6h1 y6h1Var = mal0Var.b;
        if (lfj0Var instanceof lfj0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            r6h1 r6h1Var2 = r6h1.c;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(r6h1Var.a);
            arrayList.add(y6h1VarA);
            r6h1 r6h1Var3 = new r6h1(arrayList, r6h1Var.b);
            Button button = lfj0Var.a;
            return i0p1.x(button.getClickAction(), new g5l0(r6h1Var3, (byte) 15));
        }
        if (!(lfj0Var instanceof mfj0)) {
            return null;
        }
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        r6h1 r6h1Var4 = r6h1.c;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(r6h1Var.a);
        arrayList2.add(y6h1VarA2);
        r6h1 r6h1Var5 = new r6h1(arrayList2, r6h1Var.b);
        Button button2 = ((mfj0) lfj0Var).a;
        return i0p1.x(button2.getClickAction(), new g5l0(r6h1Var5, (byte) 15));
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        nal0 nal0Var = (nal0) obj;
        wfj0 wfj0Var = (yfj0) obj4;
        if (!(wfj0Var instanceof wfj0)) {
            return null;
        }
        x6h1 x6h1VarC = nal0Var.b.c();
        x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = nal0Var.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(y6h1VarA);
        r6h1 r6h1Var3 = new r6h1(arrayList, r6h1Var2.b);
        Button button = wfj0Var.a;
        return i0p1.x(button.getClickAction(), new g5l0(r6h1Var3, (byte) 15));
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        MessageResponseToken messageResponseToken = ((qgj0) obj).a;
        String requestId = messageResponseToken.getRequestId();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-in-app-message";
        x6h1VarI.f = "11.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = requestId;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("inappmessage");
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
        Format format = messageResponseToken.getMessageData().getFormat();
        if (format instanceof Format.Banner) {
            return new eal0(r6h1Var2);
        }
        if (format instanceof Format.Modal) {
            return new gal0(messageResponseToken.getRequestId());
        }
        if (format instanceof Format.Fullscreen) {
            return new fal0(messageResponseToken.getRequestId());
        }
        return format instanceof Format.SnackBar ? new hal0(r6h1Var2) : z8s.b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:24:0x0109  */
    /* JADX WARN: Code duplicated, block: B:26:0x010d  */
    /* JADX WARN: Code duplicated, block: B:27:0x014b  */
    /* JADX WARN: Code duplicated, block: B:30:0x014f  */
    /* JADX WARN: Code duplicated, block: B:345:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v29 java.lang.Object, still in use, count: 2, list:
          (r3v29 java.lang.Object) from 0x005b: PHI (r3 I:??) = (r3v26 java.lang.Object), (r3v29 java.lang.Object) binds: [B:12:0x005a, B:342:0x005b] A[DONT_GENERATE, DONT_INLINE]
          (r3v29 java.lang.Object) from 0x0048: CHECK_CAST (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) (r3v29 java.lang.Object)
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
    public final java.lang.Object J(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 3676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v08.J(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v08(avl1 avl1Var, byte b) {
        super(4);
        this.a = b;
    }
}
