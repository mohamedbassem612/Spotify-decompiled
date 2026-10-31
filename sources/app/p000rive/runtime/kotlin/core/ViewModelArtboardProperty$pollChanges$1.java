package app.p000rive.runtime.kotlin.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class ViewModelArtboardProperty$pollChanges$1 extends hab0 implements Function0 {
    final /* synthetic */ ViewModelArtboardProperty this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelArtboardProperty$pollChanges$1(ViewModelArtboardProperty viewModelArtboardProperty) {
        super(0);
        this.this$0 = viewModelArtboardProperty;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m516invoke() {
        super/*app.rive.runtime.kotlin.core.ViewModelProperty*/.pollChanges$kotlin_release();
        List<RefCount> dependencies = this.this$0.getDependencies();
        ArrayList arrayList = new ArrayList();
        for (Object obj : dependencies) {
            if (obj instanceof BindableArtboard) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ViewModelInstance viewModelInstance = ((BindableArtboard) it.next()).getViewModelInstance();
            if (viewModelInstance != null) {
                viewModelInstance.pollChanges$kotlin_release();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m516invoke();
        return rih1.a;
    }
}
