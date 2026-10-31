package p;

import androidx.glance.session.SessionWorker;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import java.util.ArrayList;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lc41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc41(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new lc41((v6u) this.c, (wqx0) obj2, lnmVar, (byte) 0);
            case 1:
                return new lc41((mzr0) this.c, (ykg1) obj2, lnmVar, (byte) 1);
            case 2:
                return new lc41((mzr0) this.c, (String) obj2, lnmVar, (byte) 2);
            case 3:
                return new lc41((o95) this.c, (zsc) obj2, lnmVar, (byte) 3);
            case 4:
                return new lc41((dj41) this.c, (fm61) obj2, lnmVar, (byte) 4);
            case 5:
                lc41 lc41Var = new lc41((Set) obj2, lnmVar, (byte) 5);
                lc41Var.c = obj;
                return lc41Var;
            case 6:
                return new lc41((qn41) this.c, (on41) obj2, lnmVar, (byte) 6);
            case 7:
                return new lc41((bq41) this.c, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new lc41((NowPlayingScrollView) this.c, (fr41) obj2, lnmVar, (byte) 8);
            case 9:
                return new lc41((g931) this.c, (j6p0) obj2, lnmVar, (byte) 9);
            case 10:
                return new lc41((n4v) this.c, (bt41) obj2, lnmVar, (byte) 10);
            case 11:
                return new lc41((z72) this.c, (y7e1) obj2, lnmVar, (byte) 11);
            case 12:
                lc41 lc41Var2 = new lc41((s551) obj2, lnmVar, (byte) 12);
                lc41Var2.c = obj;
                return lc41Var2;
            case 13:
                return new lc41((g651) this.c, (e651) obj2, lnmVar, (byte) 13);
            case 14:
                return new lc41((c751) this.c, (i751) obj2, lnmVar, (byte) 14);
            case 15:
                return new lc41((c751) obj2, lnmVar, (byte) 15);
            case 16:
                return new lc41((i751) this.c, (hd51) obj2, lnmVar, (byte) 16);
            case 17:
                return new lc41((xtb0) this.c, (Function0) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                lc41 lc41Var3 = new lc41((uq51) obj2, lnmVar, (byte) 18);
                lc41Var3.c = obj;
                return lc41Var3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new lc41((tt51) this.c, (tqw) obj2, lnmVar, (byte) 19);
            case 20:
                lc41 lc41Var4 = new lc41((ju51) obj2, lnmVar, (byte) 20);
                lc41Var4.c = obj;
                return lc41Var4;
            case 21:
                return new lc41((ju51) this.c, (gv1) obj2, lnmVar, (byte) 21);
            case 22:
                return new lc41((x94) this.c, (String) obj2, lnmVar, (byte) 22);
            case 23:
                return new lc41((m7y0) this.c, (mp1) obj2, lnmVar, (byte) 23);
            case 24:
                return new lc41((c380) this.c, (xtb0) obj2, lnmVar, (byte) 24);
            case 25:
                return new lc41((nd61) this.c, (String) obj2, lnmVar, (byte) 25);
            case 26:
                return new lc41((y441) this.c, (ArrayList) obj2, lnmVar, (byte) 26);
            case 27:
                lc41 lc41Var5 = new lc41((cy5) obj2, lnmVar, (byte) 27);
                lc41Var5.c = obj;
                return lc41Var5;
            case 28:
                return new lc41((SessionWorker) this.c, (cy5) obj2, lnmVar, (byte) 28);
            default:
                lc41 lc41Var6 = new lc41((SessionWorker) obj2, lnmVar, (byte) 29);
                lc41Var6.c = obj;
                return lc41Var6;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 12:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((bg61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ove1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:197:0x0408  */
    /* JADX WARN: Code duplicated, block: B:200:0x0412  */
    /* JADX WARN: Code duplicated, block: B:202:0x041c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x0406 -> B:198:0x040a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r58) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 3238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lc41.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc41(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
