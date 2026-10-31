package p;

import com.spotify.home.explicitfeedback.proto.FeedbackList;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bs10 {
    public final Scheduler a;
    public final rm5 b;

    public bs10(Scheduler scheduler, rm5 rm5Var) {
        this.a = scheduler;
        this.b = rm5Var;
    }

    public static String a(String str) throws NoSuchAlgorithmException {
        byte[] bArrM = ryn1.m("cache-" + str);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bArrM, 0, bArrM.length);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new rhc(bArrDigest).e();
    }

    public final CompletableFromCallable b(String str, List list) throws NoSuchAlgorithmException {
        ms10 ms10VarR = FeedbackList.r();
        ms10VarR.n(list);
        byte[] byteArray = ((FeedbackList) ms10VarR.build()).toByteArray();
        String strA = a(str);
        byteArray.getClass();
        return new CompletableFromCallable(new wra(this.b, strA, byteArray, (byte) 1));
    }
}
