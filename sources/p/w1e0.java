package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w1e0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1e0(byte b) {
        super(3, (lnm) null);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        vr20 vr20Var = (vr20) obj;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                w1e0 w1e0Var = new w1e0(b2, lnmVar, (byte) 0);
                w1e0Var.c = vr20Var;
                w1e0Var.d = th;
                return w1e0Var.invokeSuspend(rih1Var);
            case 1:
                w1e0 w1e0Var2 = new w1e0(b2, lnmVar, (byte) 1);
                w1e0Var2.c = vr20Var;
                w1e0Var2.d = th;
                return w1e0Var2.invokeSuspend(rih1Var);
            case 2:
                w1e0 w1e0Var3 = new w1e0(b2, lnmVar, (byte) 2);
                w1e0Var3.c = vr20Var;
                w1e0Var3.d = th;
                return w1e0Var3.invokeSuspend(rih1Var);
            case 3:
                w1e0 w1e0Var4 = new w1e0(b2, lnmVar, b2);
                w1e0Var4.c = vr20Var;
                w1e0Var4.d = th;
                return w1e0Var4.invokeSuspend(rih1Var);
            case 4:
                w1e0 w1e0Var5 = new w1e0(b2, lnmVar, (byte) 4);
                w1e0Var5.c = vr20Var;
                w1e0Var5.d = th;
                return w1e0Var5.invokeSuspend(rih1Var);
            case 5:
                w1e0 w1e0Var6 = new w1e0(b2, lnmVar, (byte) 5);
                w1e0Var6.c = vr20Var;
                w1e0Var6.d = th;
                return w1e0Var6.invokeSuspend(rih1Var);
            case 6:
                w1e0 w1e0Var7 = new w1e0(b2, lnmVar, (byte) 6);
                w1e0Var7.c = vr20Var;
                w1e0Var7.d = th;
                return w1e0Var7.invokeSuspend(rih1Var);
            case 7:
                w1e0 w1e0Var8 = new w1e0(b2, lnmVar, (byte) 7);
                w1e0Var8.c = vr20Var;
                w1e0Var8.d = th;
                return w1e0Var8.invokeSuspend(rih1Var);
            case 8:
                w1e0 w1e0Var9 = new w1e0(b2, lnmVar, (byte) 8);
                w1e0Var9.c = vr20Var;
                w1e0Var9.d = th;
                return w1e0Var9.invokeSuspend(rih1Var);
            case 9:
                w1e0 w1e0Var10 = new w1e0(b2, lnmVar, (byte) 9);
                w1e0Var10.c = vr20Var;
                w1e0Var10.d = th;
                return w1e0Var10.invokeSuspend(rih1Var);
            case 10:
                w1e0 w1e0Var11 = new w1e0(b2, lnmVar, (byte) 10);
                w1e0Var11.c = vr20Var;
                w1e0Var11.d = th;
                return w1e0Var11.invokeSuspend(rih1Var);
            case 11:
                w1e0 w1e0Var12 = new w1e0(b2, lnmVar, (byte) 11);
                w1e0Var12.c = vr20Var;
                w1e0Var12.d = th;
                return w1e0Var12.invokeSuspend(rih1Var);
            case 12:
                w1e0 w1e0Var13 = new w1e0(b2, lnmVar, (byte) 12);
                w1e0Var13.c = vr20Var;
                w1e0Var13.d = th;
                return w1e0Var13.invokeSuspend(rih1Var);
            case 13:
                w1e0 w1e0Var14 = new w1e0(b2, lnmVar, (byte) 13);
                w1e0Var14.c = vr20Var;
                w1e0Var14.d = th;
                return w1e0Var14.invokeSuspend(rih1Var);
            case 14:
                w1e0 w1e0Var15 = new w1e0(b2, lnmVar, (byte) 14);
                w1e0Var15.c = vr20Var;
                w1e0Var15.d = th;
                return w1e0Var15.invokeSuspend(rih1Var);
            case 15:
                w1e0 w1e0Var16 = new w1e0(b2, lnmVar, (byte) 15);
                w1e0Var16.c = vr20Var;
                w1e0Var16.d = th;
                return w1e0Var16.invokeSuspend(rih1Var);
            case 16:
                w1e0 w1e0Var17 = new w1e0(b2, lnmVar, (byte) 16);
                w1e0Var17.c = vr20Var;
                w1e0Var17.d = th;
                return w1e0Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                w1e0 w1e0Var18 = new w1e0(b2, lnmVar, (byte) 17);
                w1e0Var18.c = vr20Var;
                w1e0Var18.d = th;
                return w1e0Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                w1e0 w1e0Var19 = new w1e0(b2, lnmVar, (byte) 18);
                w1e0Var19.c = vr20Var;
                w1e0Var19.d = th;
                return w1e0Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                w1e0 w1e0Var20 = new w1e0(b2, lnmVar, (byte) 19);
                w1e0Var20.c = vr20Var;
                w1e0Var20.d = th;
                return w1e0Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                w1e0 w1e0Var21 = new w1e0(b2, lnmVar, (byte) 20);
                w1e0Var21.c = vr20Var;
                w1e0Var21.d = th;
                return w1e0Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                w1e0 w1e0Var22 = new w1e0(b2, lnmVar, (byte) 21);
                w1e0Var22.c = vr20Var;
                w1e0Var22.d = th;
                return w1e0Var22.invokeSuspend(rih1Var);
            case 22:
                w1e0 w1e0Var23 = new w1e0(b2, lnmVar, (byte) 22);
                w1e0Var23.c = vr20Var;
                w1e0Var23.d = th;
                return w1e0Var23.invokeSuspend(rih1Var);
            case 23:
                w1e0 w1e0Var24 = new w1e0(b2, lnmVar, (byte) 23);
                w1e0Var24.c = vr20Var;
                w1e0Var24.d = th;
                return w1e0Var24.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                w1e0 w1e0Var25 = new w1e0(b2, lnmVar, (byte) 24);
                w1e0Var25.c = vr20Var;
                w1e0Var25.d = th;
                return w1e0Var25.invokeSuspend(rih1Var);
            case 25:
                w1e0 w1e0Var26 = new w1e0(b2, lnmVar, (byte) 25);
                w1e0Var26.c = vr20Var;
                w1e0Var26.d = th;
                return w1e0Var26.invokeSuspend(rih1Var);
            case 26:
                w1e0 w1e0Var27 = new w1e0(b2, lnmVar, (byte) 26);
                w1e0Var27.c = vr20Var;
                w1e0Var27.d = th;
                return w1e0Var27.invokeSuspend(rih1Var);
            case 27:
                w1e0 w1e0Var28 = new w1e0(b2, lnmVar, (byte) 27);
                w1e0Var28.c = vr20Var;
                w1e0Var28.d = th;
                return w1e0Var28.invokeSuspend(rih1Var);
            case 28:
                w1e0 w1e0Var29 = new w1e0(b2, lnmVar, (byte) 28);
                w1e0Var29.c = vr20Var;
                w1e0Var29.d = th;
                return w1e0Var29.invokeSuspend(rih1Var);
            default:
                w1e0 w1e0Var30 = new w1e0(b2, lnmVar, (byte) 29);
                w1e0Var30.c = vr20Var;
                w1e0Var30.d = th;
                return w1e0Var30.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Throwable th = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String message = th.getMessage();
                zv00 zv00Var = new zv00(message != null ? message : "Unknown error");
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var.emit(zv00Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Throwable th2 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bl50 bl50Var = new bl50(th2);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var2.emit(bl50Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = this.c;
                Throwable th3 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                inm1 inm1Var = new inm1(th3);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var3.emit(inm1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = this.c;
                Throwable th4 = this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String message2 = th4.getMessage();
                l5i1 l5i1Var = new l5i1(message2 != null ? message2 : "Unknown error");
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var4.emit(l5i1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = this.c;
                Throwable th5 = this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String message3 = th5.getMessage();
                gw00 gw00Var = new gw00(message3 != null ? message3 : "Unknown error");
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var5.emit(gw00Var, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = this.c;
                Throwable th6 = this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ho10 ho10Var = new ho10(th6);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var6.emit(ho10Var, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                vr20 vr20Var7 = this.c;
                Throwable th7 = this.d;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yn7 yn7Var = new yn7(th7);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var7.emit(yn7Var, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var8 = this.c;
                Throwable th8 = this.d;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (th8 instanceof CancellationException) {
                    throw th8;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var8.emit(eze0.a, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var9 = this.c;
                Throwable th9 = this.d;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o5e0 o5e0VarO = q3p1.o(th9);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var9.emit(o5e0VarO, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                vr20 vr20Var10 = this.c;
                Throwable th10 = this.d;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n57.t("Failed to retrieve Marquee", th10);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var10.emit(j5.a, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                vr20 vr20Var11 = this.c;
                Throwable th11 = this.d;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (th11 instanceof CancellationException) {
                    throw th11;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var11.emit(oji0.a, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                vr20 vr20Var12 = this.c;
                Throwable th12 = this.d;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th12, "Failed to observe messages push opt-in updates", new Object[0]);
                Boolean bool = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var12.emit(bool, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                vr20 vr20Var13 = this.c;
                Throwable th13 = this.d;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n57.e(th13.toString());
                Boolean bool2 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var13.emit(bool2, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                vr20 vr20Var14 = this.c;
                Throwable th14 = this.d;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.d("Error checking offline content", new Object[]{th14});
                Boolean bool3 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var14.emit(bool3, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                vr20 vr20Var15 = this.c;
                Throwable th15 = this.d;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.d("Error observing PlaybackTimeoutErrors", new Object[]{th15});
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var15.emit(r6u0.a, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                vr20 vr20Var16 = this.c;
                Throwable th16 = this.d;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n57.e(th16.toString());
                Boolean bool4 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var16.emit(bool4, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                vr20 vr20Var17 = this.c;
                Throwable th17 = this.d;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n57.e(th17.toString());
                CollectionPlatformEsperantoContainsResponse collectionPlatformEsperantoContainsResponseP = CollectionPlatformEsperantoContainsResponse.p();
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var17.emit(collectionPlatformEsperantoContainsResponseP, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vr20 vr20Var18 = this.c;
                Throwable th18 = this.d;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th18, "Failed to read played receipts product state", new Object[0]);
                Boolean bool5 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var18.emit(bool5, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                vr20 vr20Var19 = this.c;
                Throwable th19 = this.d;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th19, "Failed to read saved receipts product state", new Object[0]);
                Boolean bool6 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var19.emit(bool6, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                vr20 vr20Var20 = this.c;
                Throwable th20 = this.d;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th20, "Failed to read seen receipts product state", new Object[0]);
                Boolean bool7 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var20.emit(bool7, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                vr20 vr20Var21 = this.c;
                Throwable th21 = this.d;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n57.e("[Puffin] Error in wired management event source: " + th21);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var21.emit(tty0.a, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                vr20 vr20Var22 = this.c;
                Throwable th22 = this.d;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th22, "[CAL] Error loading queue", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var22.emit(k7z0.a, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                vr20 vr20Var23 = this.c;
                Throwable th23 = this.d;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (th23 instanceof CancellationException) {
                    throw th23;
                }
                Logger.e(th23, "Failed to observe recent emojis", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var23.emit(z6x.a, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                vr20 vr20Var24 = this.c;
                Throwable th24 = this.d;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o5e0 o5e0VarO2 = q3p1.o(th24);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var24.emit(o5e0VarO2, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                vr20 vr20Var25 = this.c;
                Throwable th25 = this.d;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o5e0 o5e0VarO3 = q3p1.o(th25);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var25.emit(o5e0VarO3, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                vr20 vr20Var26 = this.c;
                Throwable th26 = this.d;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th26, "Error while fetching Playlist metadata", new Object[0]);
                kby kbyVar = new kby((String) null, -1);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var26.emit(kbyVar, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                vr20 vr20Var27 = this.c;
                Throwable th27 = this.d;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pla1 pla1Var = new pla1(th27);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var27.emit(pla1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                vr20 vr20Var28 = this.c;
                Throwable th28 = this.d;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o5e0 o5e0VarO4 = q3p1.o(th28);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var28.emit(o5e0VarO4, this) == d9nVar ? d9nVar : rih1Var;
            case 28:
                vr20 vr20Var29 = this.c;
                Throwable th29 = this.d;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th29, "UpdateExistingDownloadsEnabledStateProvider: StreamAll failed", new Object[0]);
                Boolean bool8 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var29.emit(bool8, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var30 = this.c;
                Throwable th30 = this.d;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!(th30 instanceof IOException)) {
                    throw th30;
                }
                cen0 cen0VarC = j82.C();
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var30.emit(cen0VarC, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1e0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
