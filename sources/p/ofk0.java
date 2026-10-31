package p;

import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ofk0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk0(boolean z, b9l1 b9l1Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.b = z;
        this.d = b9l1Var;
        this.c = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
    }

    private final Object e(Object obj) {
        xut0 xut0Var = (xut0) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            xrc0 xrc0Var = (xrc0) xut0Var.d.get();
            String str = (String) xut0Var.i.getValue();
            trc0 trc0VarA = xut0Var.a();
            PlayOrigin playOrigin = (PlayOrigin) this.e;
            zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
            zpzVarY.s(playOrigin.featureIdentifier());
            zpzVarY.u(playOrigin.referrerIdentifier());
            EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
            PreparePlayOptions preparePlayOptions = (PreparePlayOptions) this.f;
            EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsA = preparePlayOptions != null ? lyg.A(preparePlayOptions) : EsPreparePlayOptions.PreparePlayOptions.p();
            preparePlayOptionsA.getClass();
            Map mapSingletonMap = Collections.singletonMap("fully_cached_files_only", "true");
            EsLoggingParams.LoggingParams loggingParamsB = xut0Var.b((String) this.c);
            this.b = true;
            obj = xrc0.b(xrc0Var, str, trc0VarA, preparePlayOptionsA, playOriginBuild, (EsPlayOptions.PlayOptions) null, mapSingletonMap, loggingParamsB, (ayc0) null, this, 144);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return xut0.d((py21) obj);
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 0);
            case 1:
                return new ofk0((iac0) this.d, (ven0) obj2, (ven0) this.e, (wrm0) this.f, lnmVar);
            case 2:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 2);
            case 3:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 3);
            case 4:
                return new ofk0(this.b, (b9l1) this.d, (ven0) obj2, (ven0) this.e, (ven0) this.f, lnmVar);
            case 5:
                return new ofk0((tob1) this.d, (lsm0) this.e, (ven0) obj2, (ven0) this.f, lnmVar, (byte) 5, false);
            case 6:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 6);
            case 7:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 7);
            case 8:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 8);
            case 9:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 9);
            case 10:
                ofk0 ofk0Var = new ofk0(this.f, obj2, lnmVar, (byte) 10);
                ofk0Var.e = obj;
                return ofk0Var;
            case 11:
                return new ofk0((rpo0) this.d, (bs91) this.e, (String) obj2, (iu30) this.f, lnmVar, (byte) 11, false);
            case 12:
                return new ofk0((z72) this.e, (ven0) obj2, (ven0) this.f, lnmVar);
            case 13:
                ofk0 ofk0Var2 = new ofk0(this.e, this.f, obj2, lnmVar, (byte) 13);
                ofk0Var2.d = obj;
                return ofk0Var2;
            case 14:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 14);
            case 15:
                ofk0 ofk0Var3 = new ofk0(this.f, obj2, lnmVar, (byte) 15);
                ofk0Var3.e = obj;
                return ofk0Var3;
            case 16:
                ofk0 ofk0Var4 = new ofk0((ven0) obj2, (ven0) this.e, (ven0) this.f, lnmVar);
                ofk0Var4.d = obj;
                return ofk0Var4;
            case 17:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 17);
            case 18:
                return new ofk0((l8r0) this.d, (h8r0) this.e, (k8r0) obj2, (iu30) this.f, lnmVar, (byte) 18, false);
            case 19:
                ofk0 ofk0Var5 = new ofk0((wfr0) obj2, lnmVar);
                ofk0Var5.f = obj;
                return ofk0Var5;
            case 20:
                ofk0 ofk0Var6 = new ofk0(this.e, this.f, obj2, lnmVar, (byte) 20);
                ofk0Var6.d = obj;
                return ofk0Var6;
            case 21:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 21);
            case 22:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 22);
            case 23:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 23);
            case 24:
                return new ofk0((bss0) this.d, (iu30) this.e, (et90) obj2, lnmVar);
            case 25:
                ofk0 ofk0Var7 = new ofk0(this.e, this.f, obj2, lnmVar, (byte) 25);
                ofk0Var7.d = obj;
                return ofk0Var7;
            case 26:
                ofk0 ofk0Var8 = new ofk0(this.e, this.f, obj2, lnmVar, (byte) 26);
                ofk0Var8.d = obj;
                return ofk0Var8;
            case 27:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 27);
            case 28:
                return new ofk0(this.d, this.e, this.f, obj2, lnmVar, (byte) 28);
            default:
                ofk0 ofk0Var9 = new ofk0(this.e, this.f, obj2, lnmVar, (byte) 29);
                ofk0Var9.d = obj;
                return ofk0Var9;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((bbr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:273:0x0634  */
    /* JADX WARN: Code duplicated, block: B:276:0x063e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.lnm] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:272:0x0632 -> B:274:0x0636). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ofk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofk0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b, boolean z) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofk0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofk0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk0(z72 z72Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.e = z72Var;
        this.c = ven0Var;
        this.f = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk0(iac0 iac0Var, ven0 ven0Var, ven0 ven0Var2, wrm0 wrm0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.d = iac0Var;
        this.c = ven0Var;
        this.e = ven0Var2;
        this.f = wrm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk0(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 16;
        this.c = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk0(wfr0 wfr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 19;
        this.c = wfr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk0(bss0 bss0Var, iu30 iu30Var, et90 et90Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.d = bss0Var;
        this.e = iu30Var;
        this.c = et90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofk0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
    }
}
