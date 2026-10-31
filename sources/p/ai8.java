package p;

import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.libs.connect.events.proto.AuthStorageResultNonAuth;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ai8 implements f961 {
    public final zh8 a;
    public final mc00 b;
    public final BehaviorSubject c = BehaviorSubject.g(new ml8(yg8.b));

    public ai8(zh8 zh8Var, mc00 mc00Var) {
        this.a = zh8Var;
        this.b = mc00Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(di8 di8Var, boolean z) throws NoWhenBranchMatchedException {
        if (z) {
            uh8 uh8Var = (uh8) this.a.b.getValue();
            uh8Var.getClass();
            of8 of8Var = di8Var.c;
            if (of8Var == null) {
                eg.o();
                return;
            }
            lkz lkzVarP = EsAuthBlob$AuthBlob.p();
            vsz vszVarP = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.p();
            byte[] bArr = of8Var.b;
            hhc hhcVar = phc.b;
            vszVarP.n(phc.e(0, bArr, bArr.length));
            vszVarP.q(of8Var.a);
            lkzVarP.n((EsUnencryptedStoredCredentials$UnencryptedStoredCredentials) vszVarP.build());
            h hVarBuild = lkzVarP.build();
            hVarBuild.getClass();
            zrz zrzVarP = EsStoredUserInfo$StoredUserInfo.p();
            zrzVarP.q(di8Var.a);
            zrzVarP.n((EsAuthBlob$AuthBlob) hVarBuild);
            EsStoredUserInfo$StoredUserInfo esStoredUserInfo$StoredUserInfo = (EsStoredUserInfo$StoredUserInfo) zrzVarP.build();
            y48 y48Var = uh8Var.a;
            esStoredUserInfo$StoredUserInfo.getClass();
            vh8 vh8Var = (xh8) y48Var.f(esStoredUserInfo$StoredUserInfo).map(new avw0(uh8Var, (byte) 10)).blockingGet();
            if (dqz0.b.b() >= 0.99d) {
                boolean z2 = vh8Var instanceof wh8;
                mc00 mc00Var = this.b;
                if (z2) {
                    t2j0 t2j0Var = mc00Var.b;
                    yh8 yh8VarN = AuthStorageResultNonAuth.n();
                    yh8VarN.q(true);
                    t2j0Var.a(yh8VarN.build());
                } else {
                    if (!(vh8Var instanceof vh8)) {
                        eg.o();
                        return;
                    }
                    t2j0 t2j0Var2 = mc00Var.b;
                    yh8 yh8VarN2 = AuthStorageResultNonAuth.n();
                    yh8VarN2.q(false);
                    yh8VarN2.n(vh8Var.a());
                    t2j0Var2.a(yh8VarN2.build());
                }
            }
        }
        this.c.onNext(new kl8(di8Var));
    }

    public final void b(nl8 nl8Var) {
        this.c.onNext(nl8Var);
    }

    public final void shutdown() {
        this.c.onNext(new ml8(yg8.h));
        Logger.g("AuthTriggerService shutdown", new Object[0]);
    }

    public final Object getApi() {
        return this;
    }
}
