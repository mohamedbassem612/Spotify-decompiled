package p;

import com.spotify.connect.castbasic.CastBasicException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus$Discarded;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus$Dismissed;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s4 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4(byte b) {
        super(2, (lnm) null);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                s4 s4Var = new s4(2, lnmVar, (byte) 0);
                s4Var.b = obj;
                return s4Var;
            case 1:
                s4 s4Var2 = new s4(2, lnmVar, (byte) 1);
                s4Var2.b = obj;
                return s4Var2;
            case 2:
                s4 s4Var3 = new s4(2, lnmVar, (byte) 2);
                s4Var3.b = obj;
                return s4Var3;
            case 3:
                s4 s4Var4 = new s4(2, lnmVar, (byte) 3);
                s4Var4.b = obj;
                return s4Var4;
            case 4:
                s4 s4Var5 = new s4(2, lnmVar, (byte) 4);
                s4Var5.b = obj;
                return s4Var5;
            case 5:
                s4 s4Var6 = new s4(2, lnmVar, (byte) 5);
                s4Var6.b = obj;
                return s4Var6;
            case 6:
                s4 s4Var7 = new s4(2, lnmVar, (byte) 6);
                s4Var7.b = obj;
                return s4Var7;
            case 7:
                s4 s4Var8 = new s4(2, lnmVar, (byte) 7);
                s4Var8.b = obj;
                return s4Var8;
            case 8:
                s4 s4Var9 = new s4(2, lnmVar, (byte) 8);
                s4Var9.b = obj;
                return s4Var9;
            case 9:
                s4 s4Var10 = new s4(2, lnmVar, (byte) 9);
                s4Var10.b = obj;
                return s4Var10;
            case 10:
                s4 s4Var11 = new s4(2, lnmVar, (byte) 10);
                s4Var11.b = obj;
                return s4Var11;
            case 11:
                s4 s4Var12 = new s4(2, lnmVar, (byte) 11);
                s4Var12.b = obj;
                return s4Var12;
            case 12:
                s4 s4Var13 = new s4(2, lnmVar, (byte) 12);
                s4Var13.b = obj;
                return s4Var13;
            case 13:
                s4 s4Var14 = new s4(2, lnmVar, (byte) 13);
                s4Var14.b = obj;
                return s4Var14;
            case 14:
                s4 s4Var15 = new s4(2, lnmVar, (byte) 14);
                s4Var15.b = obj;
                return s4Var15;
            case 15:
                s4 s4Var16 = new s4(2, lnmVar, (byte) 15);
                s4Var16.b = obj;
                return s4Var16;
            case 16:
                s4 s4Var17 = new s4(2, lnmVar, (byte) 16);
                s4Var17.b = obj;
                return s4Var17;
            case 17:
                s4 s4Var18 = new s4(2, lnmVar, (byte) 17);
                s4Var18.b = obj;
                return s4Var18;
            case 18:
                s4 s4Var19 = new s4(2, lnmVar, (byte) 18);
                s4Var19.b = obj;
                return s4Var19;
            case 19:
                s4 s4Var20 = new s4(2, lnmVar, (byte) 19);
                s4Var20.b = obj;
                return s4Var20;
            case 20:
                s4 s4Var21 = new s4(2, lnmVar, (byte) 20);
                s4Var21.b = obj;
                return s4Var21;
            case 21:
                s4 s4Var22 = new s4(2, lnmVar, (byte) 21);
                s4Var22.b = obj;
                return s4Var22;
            case 22:
                s4 s4Var23 = new s4(2, lnmVar, (byte) 22);
                s4Var23.b = obj;
                return s4Var23;
            case 23:
                s4 s4Var24 = new s4(2, lnmVar, (byte) 23);
                s4Var24.b = obj;
                return s4Var24;
            case 24:
                s4 s4Var25 = new s4(2, lnmVar, (byte) 24);
                s4Var25.b = obj;
                return s4Var25;
            case 25:
                s4 s4Var26 = new s4(2, lnmVar, (byte) 25);
                s4Var26.b = obj;
                return s4Var26;
            case 26:
                s4 s4Var27 = new s4(2, lnmVar, (byte) 26);
                s4Var27.b = obj;
                return s4Var27;
            case 27:
                s4 s4Var28 = new s4(2, lnmVar, (byte) 27);
                s4Var28.b = obj;
                return s4Var28;
            case 28:
                s4 s4Var29 = new s4(2, lnmVar, (byte) 28);
                s4Var29.b = obj;
                return s4Var29;
            default:
                s4 s4Var30 = new s4(2, lnmVar, (byte) 29);
                s4Var30.b = obj;
                return s4Var30;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((bj) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((md0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((t2j1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((w8c0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((MessagePresentationStatus) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                return create((wgm1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((iud) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((iud) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((v7a) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((pb31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                create((ie61) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                return create((Throwable) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((i1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((u03) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z = false;
        boolean z = false;
        i = 0;
        int i = 0;
        z = false;
        boolean z2 = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Boolean.valueOf(!((uv00) obj2).f);
            case 1:
                hm5.M(obj);
                Objects.toString((bj) obj2);
                return rih1Var;
            case 2:
                hm5.M(obj);
                return rih1Var;
            case 3:
                k1r k1rVar = (k1r) obj2;
                hm5.M(obj);
                k1rVar.getClass();
                return Boolean.valueOf(!(k1rVar instanceof j1r));
            case 4:
                hm5.M(obj);
                return Boolean.valueOf(!((Map) obj2).isEmpty());
            case 5:
                t2j1 t2j1Var = (t2j1) obj2;
                hm5.M(obj);
                return Boolean.valueOf(t2j1Var != t2j1.c);
            case 6:
                PlayerState playerState = (PlayerState) obj2;
                hm5.M(obj);
                return Boolean.valueOf(playerState != null);
            case 7:
                k1r k1rVar2 = (k1r) obj2;
                hm5.M(obj);
                k1rVar2.getClass();
                return Boolean.valueOf(!(k1rVar2 instanceof j1r));
            case 8:
                i1r i1rVar = (k1r) obj2;
                hm5.M(obj);
                if ((i1rVar instanceof h1r) || ((i1rVar instanceof i1r) && i1rVar.a != null)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 9:
                hm5.M(obj);
                return Boolean.valueOf(((w8c0) obj2).a(w8c0.d));
            case 10:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj2;
                hm5.M(obj);
                return Boolean.valueOf((messagePresentationStatus instanceof MessagePresentationStatus$Dismissed) || (messagePresentationStatus instanceof MessagePresentationStatus$Discarded));
            case 11:
                k1r k1rVar3 = (k1r) obj2;
                hm5.M(obj);
                k1rVar3.getClass();
                return Boolean.valueOf(!(k1rVar3 instanceof j1r));
            case 12:
                hm5.M(obj);
                return Boolean.valueOf(((PlayerState) obj2).restrictions().disallowSeekingReasons().isEmpty());
            case 13:
                hm5.M(obj);
                List list = (List) obj2;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((jy5) it.next()).f && (i = i + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                new Integer(i);
                return rih1Var;
            case 14:
                hm5.M(obj);
                return Boolean.valueOf(!((wgm1) obj2).c.f);
            case 15:
                hm5.M(obj);
                return Boolean.valueOf(!((uv00) obj2).f);
            case 16:
                hm5.M(obj);
                return Boolean.valueOf(!((uv00) obj2).f);
            case 17:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 18:
                aud audVar = (iud) obj2;
                hm5.M(obj);
                if (audVar instanceof aud) {
                    aud audVar2 = audVar;
                    return new ir7(audVar2.a, audVar2.b);
                }
                if (audVar instanceof ztd) {
                    ztd ztdVar = (ztd) audVar;
                    return new hr7(ztdVar.e, ztdVar.b, ztdVar.c, ztdVar.d);
                }
                if (!(audVar instanceof ytd)) {
                    return null;
                }
                Object obj3 = ((ytd) audVar).a;
                String str = obj3 instanceof uke ? ((uke) obj3).a : null;
                if (str != null) {
                    return new fr7(str);
                }
                return null;
            case 19:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 20:
                aud audVar3 = (iud) obj2;
                hm5.M(obj);
                if (audVar3 instanceof aud) {
                    return new gt7(audVar3.a);
                }
                if (audVar3 instanceof ztd) {
                    ztd ztdVar2 = (ztd) audVar3;
                    return new it7(ztdVar2.b, ztdVar2.c);
                }
                if (!(audVar3 instanceof ytd)) {
                    return null;
                }
                Object obj4 = ((ytd) audVar3).a;
                if (obj4 instanceof e7i0) {
                    return new ht7((e7i0) obj4);
                }
                return null;
            case 21:
                hm5.M(obj);
                return Boolean.valueOf(!((uv00) obj2).f);
            case 22:
                v7a v7aVar = (v7a) obj2;
                hm5.M(obj);
                if (v7aVar != v7a.c && v7aVar != v7a.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                lb31 lb31Var = (pb31) obj2;
                hm5.M(obj);
                boolean z3 = lb31Var instanceof kb31;
                r6x r6xVar = r6x.a;
                if (!z3) {
                    if (lb31Var instanceof lb31) {
                        List list2 = lb31Var.c;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list2) {
                            if (obj5 instanceof nsn) {
                                arrayList.add(obj5);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((nsn) it2.next()).a);
                        }
                        return new huz(arrayList2, (byte) 10);
                    }
                    if (!(lb31Var instanceof mb31) && !(lb31Var instanceof nb31)) {
                        eg.o();
                        return null;
                    }
                }
                return r6xVar;
            case 24:
                hm5.M(obj);
                new StringBuilder("Effect emitted: ").append((ie61) obj2);
                return rih1Var;
            case 25:
                hm5.M(obj);
                return Boolean.valueOf(((Throwable) obj2) instanceof CastBasicException);
            case 26:
                hm5.M(obj);
                return Boolean.valueOf(((i1r) obj2).a == cob1.a);
            case 27:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 28:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            default:
                hm5.M(obj);
                return Boolean.valueOf(u890.j(((u03) obj2).a(), "chat_ai"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
