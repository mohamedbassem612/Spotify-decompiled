package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class esp implements f9j0 {
    public final g3z a;
    public final dsp b = new dsp(this, 0);
    public final jly0 c = xqu.b(new dsp(this, 1));
    public final jly0 d = xqu.b(new dsp(this, 2));
    public final jly0 e = xqu.b(new dsp(this, 4));
    public final jly0 f = xqu.b(new dsp(this, 5));
    public final dsp g = new dsp(this, 6);
    public final dsp h = new dsp(this, 7);
    public final jly0 i = xqu.b(new dsp(this, 10));
    public final jly0 j = xqu.b(new dsp(this, 11));
    public final jly0 k = xqu.b(new dsp(this, 9));
    public final jly0 l = xqu.b(new dsp(this, 12));
    public final jly0 m = xqu.b(new dsp(this, 8));
    public final jly0 n = xqu.b(new dsp(this, 13));
    public final jly0 o = xqu.b(new dsp(this, 14));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f17p = xqu.b(new dsp(this, 16));
    public final jly0 q = xqu.b(new dsp(this, 15));
    public final jly0 r = xqu.b(new dsp(this, 17));
    public final jly0 s = xqu.b(new dsp(this, 18));
    public final jly0 t = xqu.b(new dsp(this, 19));
    public final jly0 u = xqu.b(new dsp(this, 20));
    public final jly0 v = xqu.b(new dsp(this, 22));
    public final jly0 w = xqu.b(new dsp(this, 21));
    public final jly0 x = xqu.b(new dsp(this, 23));
    public final jly0 y = xqu.b(new dsp(this, 24));
    public final jly0 z = xqu.b(new dsp(this, 25));
    public final jly0 A = xqu.b(new dsp(this, 3));
    public final jly0 B = xqu.b(new dsp(this, 26));
    public final jly0 C = xqu.b(new dsp(this, 27));
    public final jly0 D = xqu.b(new dsp(this, 28));
    public final jly0 E = xqu.b(new dsp(this, 29));

    public esp(g3z g3zVar) {
        this.a = g3zVar;
    }

    public static li a() {
        return new li(new j141((byte) 23));
    }

    public static da e() {
        return new da(new tae1((byte) 0), new ryq((byte) 4), (byte) 24);
    }

    public final da b() {
        return new da(new da(new j141((byte) 28), new ifl1(this.b, (byte) 10), (byte) 11), new j141((byte) 26), (byte) 10);
    }

    public final lag c() {
        g3z g3zVar = this.a;
        return new lag((jjg) ((RetrofitMaker) g3zVar.e.get()).createWebgateService(jjg.class, "android-messaging-clientmessagingplatform-clientmessagingplatformsdkimpl"), new ffr(new xxi0(new ip31(new kem0(b(), a(), new gy9(), new ryq((byte) 7), d(), new j141((byte) 22), new j141((byte) 29)), new as30(b(), a(), new gy9(), new ryq((byte) 7), d(), new j141((byte) 29), new j141((byte) 22)), new r6a(b(), a(), new emv0((byte) 27), new gy9(), e(), d()), new q4f1(b(), e(), a(), new ryq((byte) 7)), new wq91(b(), e(), a(), new ryq((byte) 7)), new qwb(b(), new emv0((byte) 27), new ryq((byte) 7), d(), a(), e()), new vd80(new emv0((byte) 27), a(), new ryq((byte) 7), b(), new rw9(), new gy9(), e()), new djl1(), (byte) 25), new b170(b())), new j141((byte) 27), new tae1((byte) 1), (byte) 2), new tae1((byte) 1), new gjc((t2j0) g3zVar.q.get()), (byte) 3);
    }

    public final da d() {
        return new da(new ryq((byte) 7), b(), (byte) 19);
    }

    public final MessagesDatabase f() {
        Context context = (Context) this.a.a.get();
        wxi0 wxi0Var = new wxi0();
        kmd kmdVar = new kmd();
        bn31 bn31VarT = u890.t(context.getApplicationContext(), MessagesDatabase.class, "messages.db");
        bn31VarT.b(wxi0Var);
        bn31VarT.b(kmdVar);
        bn31VarT.a(new trj0[]{bqn1.a});
        bn31VarT.d();
        return bn31VarT.c();
    }
}
