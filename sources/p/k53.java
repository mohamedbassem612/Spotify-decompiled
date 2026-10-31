package p;

import com.spotify.liveroom.commonimpl.ListPlaybackException;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k53 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k53(Object obj, Object obj2, lnm lnmVar, byte b) {
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
                return new k53((ip31) this.c, (w6e0) obj2, lnmVar, (byte) 0);
            case 1:
                k53 k53Var = new k53((mu4) obj2, lnmVar, (byte) 1);
                k53Var.c = obj;
                return k53Var;
            case 2:
                return new k53((z7a) this.c, (y6a) obj2, lnmVar, (byte) 2);
            case 3:
                k53 k53Var2 = new k53((w6b) obj2, lnmVar, (byte) 3);
                k53Var2.c = obj;
                return k53Var2;
            case 4:
                return new k53((uff) this.c, (iu30) obj2, lnmVar, (byte) 4);
            case 5:
                k53 k53Var3 = new k53((kvg) obj2, lnmVar, (byte) 5);
                k53Var3.c = obj;
                return k53Var3;
            case 6:
                k53 k53Var4 = new k53((List) obj2, lnmVar, (byte) 6);
                k53Var4.c = obj;
                return k53Var4;
            case 7:
                return new k53((tnm) this.c, (py8) obj2, lnmVar, (byte) 7);
            case 8:
                return new k53((jmq) this.c, (ssw0) obj2, lnmVar, (byte) 8);
            case 9:
                return new k53((o3s) this.c, (String) obj2, lnmVar, (byte) 9);
            case 10:
                return new k53((idn0) this.c, (ven0) obj2, lnmVar, (byte) 10);
            case 11:
                k53 k53Var5 = new k53((mr20) obj2, lnmVar, (byte) 11);
                k53Var5.c = obj;
                return k53Var5;
            case 12:
                return new k53((idn0) this.c, (ry20) obj2, lnmVar, (byte) 12);
            case 13:
                return new k53((a840) obj2, lnmVar, (byte) 13);
            case 14:
                return new k53((wo70) this.c, (MusicAppLock) obj2, lnmVar, (byte) 14);
            case 15:
                return new k53((wmy) this.c, (mr20) obj2, lnmVar, (byte) 15);
            case 16:
                return new k53((qvc0) this.c, (rsc0) obj2, lnmVar, (byte) 16);
            case 17:
                return new k53((yfu) this.c, (lqd0) obj2, lnmVar, (byte) 17);
            case 18:
                return new k53((jnd0) this.c, obj2, lnmVar, (byte) 18);
            case 19:
                return new k53((f6h0) this.c, (iu30) obj2, lnmVar, (byte) 19);
            case 20:
                return new k53((mr20) this.c, (knn0) obj2, lnmVar, (byte) 20);
            case 21:
                k53 k53Var6 = new k53((khp0) obj2, lnmVar, (byte) 21);
                k53Var6.c = obj;
                return k53Var6;
            case 22:
                return new k53((vu30) this.c, (j5c) obj2, lnmVar, (byte) 22);
            case 23:
                return new k53((rf01) this.c, (zy70) obj2, lnmVar, (byte) 23);
            case 24:
                k53 k53Var7 = new k53((ObservableSource) obj2, lnmVar, (byte) 24);
                k53Var7.c = obj;
                return k53Var7;
            case 25:
                return new k53((en31) this.c, (iu30) obj2, lnmVar, (byte) 25);
            case 26:
                k53 k53Var8 = new k53((xm41) obj2, lnmVar, (byte) 26);
                k53Var8.c = obj;
                return k53Var8;
            case 27:
                k53 k53Var9 = new k53((h191) obj2, lnmVar, (byte) 27);
                k53Var9.c = obj;
                return k53Var9;
            case 28:
                return new k53((pvk1) this.c, (String) obj2, lnmVar, (byte) 28);
            default:
                k53 k53Var10 = new k53((n811) obj2, lnmVar, (byte) 29);
                k53Var10.c = obj;
                return k53Var10;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.liveroom.commonimpl.ListPlaybackException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, ListPlaybackException, KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((jnd0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((Throwable) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.liveroom.commonimpl.ListPlaybackException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:224:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:227:0x0500  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0215 -> B:108:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x04f4 -> B:225:0x04f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws kotlin.NoWhenBranchMatchedException, com.spotify.liveroom.commonimpl.ListPlaybackException, kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k53.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k53(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
