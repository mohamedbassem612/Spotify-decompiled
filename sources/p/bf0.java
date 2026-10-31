package p;

import android.net.Uri;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bf0 extends a8d1 implements vu30 {
    public final /* synthetic */ t45 X;
    public final /* synthetic */ boolean Y;
    public String a;
    public s2t b;
    public iko c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PlayerState f;
    public final /* synthetic */ gf0 g;
    public final /* synthetic */ b7g1 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(PlayerState playerState, gf0 gf0Var, b7g1 b7g1Var, String str, String str2, t45 t45Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.f = playerState;
        this.g = gf0Var;
        this.h = b7g1Var;
        this.i = str;
        this.t = str2;
        this.X = t45Var;
        this.Y = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        bf0 bf0Var = new bf0(this.f, this.g, this.h, this.i, this.t, this.X, this.Y, lnmVar);
        bf0Var.e = obj;
        return bf0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        String strA0;
        String str;
        String str2;
        s2t s2tVarQ;
        Object objQ;
        Object next;
        Object objE;
        iko ikoVar;
        d9n d9nVar;
        String str3;
        d9n d9nVar2;
        Object objA;
        c9n c9nVar = (c9n) this.e;
        byte b = this.d;
        PlayerState playerState = this.f;
        gf0 gf0Var = this.g;
        d9n d9nVar3 = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVarQ = this.b;
                String str4 = this.a;
                hm5.M(obj);
                str2 = str4;
                str = null;
                objQ = obj;
            } else {
                if (b != 2) {
                    if (b == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iko ikoVar2 = this.c;
                String str5 = this.a;
                hm5.M(obj);
                str3 = str5;
                d9nVar = d9nVar3;
                str = null;
                ikoVar = ikoVar2;
                objE = obj;
            }
            String str6 = (String) objE;
            this.e = str;
            this.a = str;
            this.b = str;
            this.c = str;
            this.d = (byte) 3;
            d9nVar2 = d9nVar;
            objA = gf0Var.a(this.i, playerState, this.h, str3, str6, ikoVar, this.t, this.X, this.Y, this);
            if (objA == d9nVar2) {
                return d9nVar2;
            }
            return objA;
        }
        hm5.M(obj);
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        contextTrack.getClass();
        b7g1 b7g1Var = this.h;
        a7g1 a7g1Var = b7g1Var instanceof a7g1 ? (a7g1) b7g1Var : null;
        String string = "";
        if (a7g1Var != null) {
            Iterator it = a7g1Var.b.a.a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((up70) next).b != vp70.c);
            up70 up70Var = (up70) next;
            strA0 = up70Var != null ? up70Var.a.a : null;
            if (strA0 == null) {
                strA0 = "";
            }
        } else {
            strA0 = null;
        }
        if (strA0 == null) {
            strA0 = "";
        }
        if (strA0.length() == 0 && (strA0 = l4o1.a0(contextTrack, "image_url")) == null) {
            strA0 = "";
        }
        a42 a42Var = gf0Var.e;
        if (strA0.length() != 0) {
            string = ((aai0) a42Var.b).e(Uri.parse(strA0), 2, 2).toString();
            string.getClass();
        }
        str = null;
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new c6(gf0Var, contextTrack, this.X, (lnm) null, (byte) 4), 3);
        String str7 = strA0;
        String str8 = string;
        str2 = str7;
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new af0(gf0Var, this.i, contextTrack, str8, str7, this.X, (lnm) null, (byte) 0), 3);
        this.e = null;
        this.a = str2;
        this.b = s2tVarQ;
        this.d = (byte) 1;
        objQ = s2tVarQ2.Q(this);
        if (objQ != d9nVar3) {
        }
        return d9nVar3;
        iko ikoVar3 = (iko) objQ;
        this.e = str;
        this.a = str2;
        this.b = str;
        this.c = ikoVar3;
        this.d = (byte) 2;
        objE = s2tVarQ.E(this);
        if (objE != d9nVar3) {
            ikoVar = ikoVar3;
            d9nVar = d9nVar3;
            str3 = str2;
            String str9 = (String) objE;
            this.e = str;
            this.a = str;
            this.b = str;
            this.c = str;
            this.d = (byte) 3;
            d9nVar2 = d9nVar;
            objA = gf0Var.a(this.i, playerState, this.h, str3, str9, ikoVar, this.t, this.X, this.Y, this);
            if (objA == d9nVar2) {
                return d9nVar2;
            }
            return objA;
        }
        return d9nVar3;
    }
}
