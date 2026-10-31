package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface hzi0 {
    Completable a(String str);

    SingleSubject b(Object obj, String str);

    String getId();

    BehaviorSubject getState();
}
