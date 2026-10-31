package p;

import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x7c implements Consumer {
    public final /* synthetic */ a8c a;
    public final /* synthetic */ PublishSubject b;

    public x7c(a8c a8cVar, PublishSubject publishSubject) {
        this.a = a8cVar;
        this.b = publishSubject;
    }

    public final void accept(Object obj) {
        BrowseState browseState = (BrowseState) obj;
        a8c a8cVar = this.a;
        bpb1 bpb1Var = a8cVar.t;
        browseState.getClass();
        bpb1Var.m((Object) null, browseState);
        if (browseState instanceof BrowseState.Error) {
            a8cVar.h(((BrowseState.Error) browseState).getThrowable());
            return;
        }
        boolean z = browseState instanceof BrowseState.Content;
        if (!z) {
            if ((browseState instanceof BrowseState.UIRendered) || browseState.equals(BrowseState.Loading.INSTANCE)) {
                return;
            }
            eg.o();
            return;
        }
        zr6 zr6Var = a8cVar.f;
        BrowseState.Content content = (BrowseState.Content) browseState;
        List<s7c> sections = content.getModel().getSections();
        Set set = zr6Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((is80) it.next()).d(sections));
        }
        r4u.b(arrayList).e(sections);
        BrowseState.Content content2 = z ? content : null;
        if (content2 != null) {
            this.b.onNext(content2);
        } else {
            ncn0.d(browseState, " is not a Content state");
        }
    }
}
