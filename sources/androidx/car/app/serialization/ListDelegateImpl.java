package androidx.car.app.serialization;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.f;
import java.util.List;
import kotlin.Metadata;
import p.b5q0;
import p.eg;
import p.l1d;
import p.qrd;
import p.toc0;
import p.u890;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\"B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0012¢\u0006\u0004\b\u0005\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016¨\u0006#"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl;", "T", "Lp/toc0;", "", "content", "<init>", "(Ljava/util/List;)V", "()V", "", "startIndex", "endIndex", "Lp/b5q0;", "callback", "Lp/rih1;", "requestItemRange", "(IILp/b5q0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "_size", "I", "listHashCode", "Landroidx/car/app/serialization/IRemoteList;", "mStub", "Landroidx/car/app/serialization/IRemoteList;", "getSize", "size", "RemoteListStub", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListDelegateImpl<T> implements toc0 {
    private int _size;
    private int listHashCode;
    private IRemoteList mStub;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl$RemoteListStub;", "T", "Landroidx/car/app/serialization/IRemoteList$Stub;", "", "mContent", "<init>", "(Ljava/util/List;)V", "", "startIndex", "endIndex", "Landroidx/car/app/IOnDoneCallback;", "callback", "Lp/rih1;", "requestItemRange", "(IILandroidx/car/app/IOnDoneCallback;)V", "getInterfaceVersion", "()I", "Ljava/util/List;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteListStub<T> extends IRemoteList.Stub {
        private final List<T> mContent;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteListStub(List<? extends T> list) {
            this.mContent = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object requestItemRange$lambda$0(RemoteListStub remoteListStub, int i, int i2) {
            return remoteListStub.mContent.subList(i, i2 + 1);
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int startIndex, final int endIndex, IOnDoneCallback callback) {
            f.b(callback, "lazy load content", new z321() { // from class: androidx.car.app.serialization.a
                @Override // p.z321
                public final Object b() {
                    return ListDelegateImpl.RemoteListStub.requestItemRange$lambda$0(this.a, startIndex, endIndex);
                }
            });
        }
    }

    public ListDelegateImpl(List<? extends T> list) {
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new RemoteListStub(list);
    }

    public boolean equals(Object other) {
        return (other instanceof ListDelegateImpl) && ((ListDelegateImpl) other).listHashCode == this.listHashCode;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int get_size() {
        return this._size;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getListHashCode() {
        return this.listHashCode;
    }

    public void requestItemRange(int startIndex, int endIndex, b5q0 callback) {
        get_size();
        try {
            IRemoteList iRemoteList = this.mStub;
            if (iRemoteList != null) {
                iRemoteList.requestItemRange(startIndex, endIndex, f.a());
            } else {
                u890.C("mStub");
                throw null;
            }
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    public String toString() {
        return l1d.j(get_size(), this.listHashCode, "ListDelegate { Size: ", ", listHashCode: ", " }");
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }
}
