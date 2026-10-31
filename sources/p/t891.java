package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t891 implements hzi0 {
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final BehaviorSubject d = BehaviorSubject.f();
    public final BehaviorSubject e = BehaviorSubject.g(new ezi0("SLATE_HANDLER_ID"));

    public t891(Context context) {
        this.a = context;
    }

    @Override // p.hzi0
    public final Completable a(String str) {
        return new CompletableCreate(new ke71(this, str, (byte) 21));
    }

    @Override // p.hzi0
    public final SingleSubject b(Object obj, String str) {
        SingleSubject singleSubject = new SingleSubject();
        this.b.put(str, (gjo0) obj);
        int i = SlateMessageHostActivity.f1;
        Context context = this.a;
        Intent intentZ = rc2.z(context, str);
        intentZ.setFlags(268435456);
        context.startActivity(intentZ);
        this.c.put(str, singleSubject);
        return singleSubject;
    }

    @Override // p.hzi0
    public final String getId() {
        return "SLATE_HANDLER_ID";
    }

    @Override // p.hzi0
    public final BehaviorSubject getState() {
        return this.e;
    }
}
