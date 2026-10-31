package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class czq0 extends a8d1 implements vu30 {
    public final /* synthetic */ bju X;
    public final /* synthetic */ gw70 Y;
    public final /* synthetic */ Image Z;
    public s2t a;
    public l2t b;
    public String c;
    public String d;
    public yj41 e;
    public yj41 f;
    public long g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.Wrapper t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czq0(SceneTemplate.ArtistCardsContent.Wrapper wrapper, bju bjuVar, gw70 gw70Var, Image image, lnm lnmVar) {
        super(2, lnmVar);
        this.t = wrapper;
        this.X = bjuVar;
        this.Y = gw70Var;
        this.Z = image;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        czq0 czq0Var = new czq0(this.t, this.X, this.Y, this.Z, lnmVar);
        czq0Var.i = obj;
        return czq0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00eb  */
    public final Object invokeSuspend(Object obj) {
        l2t l2tVarQ;
        Object objQ;
        l2t l2tVar;
        String str;
        String str2;
        long j;
        yj41 yj41Var;
        Object objE;
        String str3;
        String str4;
        yj41 yj41Var2;
        Object objE2;
        String str5;
        yj41 yj41Var3;
        yj41 yj41Var4;
        long j2;
        String str6;
        c9n c9nVar = (c9n) this.i;
        byte b = this.h;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            bju bjuVar = this.X;
            SceneTemplate.ArtistCardsContent.Wrapper wrapper = this.t;
            gw70 gw70Var = this.Y;
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new bzq0(bjuVar, wrapper, gw70Var, null, (byte) 0), 3);
            l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new bzq0(bjuVar, wrapper, gw70Var, null, (byte) 1), 3);
            l2t l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new dvq0(bjuVar, this.Z, gw70Var, (lnm) null, (byte) 2), 3);
            String subtitle = wrapper.getSubtitle();
            String strP = wrapper.p();
            long jD = ror0.d(wrapper.q());
            this.i = null;
            this.a = l2tVarQ;
            this.b = l2tVarQ2;
            this.c = subtitle;
            this.d = strP;
            this.g = jD;
            this.h = (byte) 1;
            objQ = s2tVarQ.Q(this);
            if (objQ != d9nVar) {
                l2tVar = l2tVarQ2;
                str = subtitle;
                str2 = strP;
                j = jD;
            }
            return d9nVar;
        }
        if (b == 1) {
            j = this.g;
            String str7 = this.d;
            String str8 = this.c;
            l2t l2tVar2 = this.b;
            l2t l2tVar3 = this.a;
            hm5.M(obj);
            l2tVarQ = l2tVar3;
            l2tVar = l2tVar2;
            str = str8;
            str2 = str7;
            objQ = obj;
        } else {
            if (b == 2) {
                j = this.g;
                yj41 yj41Var5 = this.e;
                String str9 = this.d;
                str4 = this.c;
                l2t l2tVar4 = this.b;
                hm5.M(obj);
                l2tVar = l2tVar4;
                str3 = str9;
                yj41Var = yj41Var5;
                objE = obj;
                yj41Var2 = (yj41) objE;
                this.i = null;
                this.a = null;
                this.b = null;
                this.c = str4;
                this.d = str3;
                this.e = yj41Var;
                this.f = yj41Var2;
                this.g = j;
                this.h = (byte) 3;
                objE2 = l2tVar.E(this);
                if (objE2 != d9nVar) {
                    str5 = str3;
                    yj41Var3 = yj41Var2;
                    String str10 = str4;
                    yj41Var4 = yj41Var;
                    j2 = j;
                    str6 = str10;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = this.g;
            yj41 yj41Var6 = this.f;
            yj41 yj41Var7 = this.e;
            String str11 = this.d;
            String str12 = this.c;
            hm5.M(obj);
            yj41Var3 = yj41Var6;
            yj41Var4 = yj41Var7;
            str5 = str11;
            j2 = j3;
            str6 = str12;
            objE2 = obj;
        }
        return new zyq0(str6, str5, j2, yj41Var4, yj41Var3, (yj41) objE2);
        yj41Var = (yj41) objQ;
        this.i = null;
        this.a = null;
        this.b = l2tVar;
        this.c = str;
        this.d = str2;
        this.e = yj41Var;
        this.g = j;
        this.h = (byte) 2;
        objE = l2tVarQ.E(this);
        if (objE != d9nVar) {
            String str13 = str;
            str3 = str2;
            str4 = str13;
            yj41Var2 = (yj41) objE;
            this.i = null;
            this.a = null;
            this.b = null;
            this.c = str4;
            this.d = str3;
            this.e = yj41Var;
            this.f = yj41Var2;
            this.g = j;
            this.h = (byte) 3;
            objE2 = l2tVar.E(this);
            if (objE2 != d9nVar) {
                str5 = str3;
                yj41Var3 = yj41Var2;
                String str14 = str4;
                yj41Var4 = yj41Var;
                j2 = j;
                str6 = str14;
                return new zyq0(str6, str5, j2, yj41Var4, yj41Var3, (yj41) objE2);
            }
        }
        return d9nVar;
    }
}
