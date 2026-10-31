package p;

import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f4m extends v9 {
    public final nzl c;
    public final Scheduler d;
    public final Scheduler e;

    public f4m(nzl nzlVar, Scheduler scheduler, Scheduler scheduler2, ContentPickerFragment contentPickerFragment) {
        super(contentPickerFragment);
        this.c = nzlVar;
        this.d = scheduler;
        this.e = scheduler2;
    }

    public final xbk1 e(fe41 fe41Var) {
        return new a4m(new e4m(this), fe41Var);
    }
}
