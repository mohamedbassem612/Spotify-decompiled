package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ecf1 extends a8d1 implements iu30 {
    public bk41[] a;
    public bk41[] b;
    public String c;
    public boolean d;
    public byte e;
    public final /* synthetic */ s2t f;
    public final /* synthetic */ s2t g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SceneTemplate.TopPlaylistsContent.Single i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecf1(s2t s2tVar, s2t s2tVar2, boolean z, SceneTemplate.TopPlaylistsContent.Single single, lnm lnmVar) {
        super(1, lnmVar);
        this.f = s2tVar;
        this.g = s2tVar2;
        this.h = z;
        this.i = single;
    }

    public final lnm create(lnm lnmVar) {
        return new ecf1(this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object invokeSuspend(Object obj) {
        bk41[] bk41VarArr;
        String str;
        ?? r0;
        bk41[] bk41VarArr2;
        String str2;
        ?? r1;
        bk41[] bk41VarArr3;
        byte b = this.e;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            bk41VarArr = new bk41[2];
            this.a = bk41VarArr;
            this.b = bk41VarArr;
            str = "topPlaylistsSingleBackgroundLayer";
            this.c = "topPlaylistsSingleBackgroundLayer";
            this.d = false;
            this.e = (byte) 1;
            obj = this.f.Q(this);
            if (obj != d9nVar) {
                r0 = 0;
                bk41VarArr2 = bk41VarArr;
            }
            return d9nVar;
        }
        if (b == 1) {
            boolean z = this.d;
            str = this.c;
            bk41[] bk41VarArr4 = this.b;
            bk41[] bk41VarArr5 = this.a;
            hm5.M(obj);
            bk41VarArr2 = bk41VarArr4;
            bk41VarArr = bk41VarArr5;
            r0 = z;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = this.d;
            str2 = this.c;
            bk41VarArr3 = this.b;
            bk41VarArr = this.a;
            hm5.M(obj);
            r1 = z2;
        }
        yj41 yj41Var = (yj41) obj;
        SceneTemplate.TopPlaylistsContent.Single single = this.i;
        bk41VarArr3[r1] = new bk41(str2, Collections.singletonList(new thd0(new gcf1(yj41Var, new dcf1(single, (byte) 0), new dcf1(single, (byte) 1), new dcf1(single, (byte) 2), new dcf1(single, (byte) 3)), this.h)));
        return p7h.M(bk41VarArr);
        bk41VarArr2[r0] = new bk41(str, Collections.singletonList(obj));
        this.a = bk41VarArr;
        this.b = bk41VarArr;
        this.c = "topPlaylistsSingleLayer";
        this.d = true;
        this.e = (byte) 2;
        Object objQ = this.g.Q(this);
        if (objQ != d9nVar) {
            str2 = "topPlaylistsSingleLayer";
            obj = objQ;
            r1 = 1;
            bk41VarArr3 = bk41VarArr;
            yj41 yj41Var2 = (yj41) obj;
            SceneTemplate.TopPlaylistsContent.Single single2 = this.i;
            bk41VarArr3[r1] = new bk41(str2, Collections.singletonList(new thd0(new gcf1(yj41Var2, new dcf1(single2, (byte) 0), new dcf1(single2, (byte) 1), new dcf1(single2, (byte) 2), new dcf1(single2, (byte) 3)), this.h)));
            return p7h.M(bk41VarArr);
        }
        return d9nVar;
    }
}
