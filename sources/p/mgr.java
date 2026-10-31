package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.watchfeed.uiusecases.element.watchfeedpagerindicator.WatchFeedPagerIndicatorView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mgr implements qzh {
    public final Scheduler a;
    public final qxx0 b;
    public final cp31 c;
    public final i2r0 d;
    public final rku e;
    public boolean f;
    public gh7 g;

    public mgr(Context context, Scheduler scheduler, gw70 gw70Var) {
        this.a = scheduler;
        qxx0 qxx0Var = new qxx0(new kgr(this, (byte) 0));
        this.b = qxx0Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624067, (ViewGroup) null, false);
        int i = 2131427644;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427644);
        if (textView != null) {
            i = 2131427645;
            ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131427645);
            if (artworkViewT != null) {
                i = 2131428391;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131428391);
                if (textView2 != null) {
                    i = 2131430277;
                    ViewPager2 viewPager2T = m5n1.t(constraintLayoutInflate, 2131430277);
                    if (viewPager2T != null) {
                        i = 2131430278;
                        if (m5n1.t(constraintLayoutInflate, 2131430278) != null) {
                            i = 2131430279;
                            WatchFeedPagerIndicatorView watchFeedPagerIndicatorViewT = m5n1.t(constraintLayoutInflate, 2131430279);
                            if (watchFeedPagerIndicatorViewT != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                cp31 cp31Var = new cp31();
                                cp31Var.a = textView;
                                cp31Var.b = artworkViewT;
                                cp31Var.c = textView2;
                                cp31Var.d = viewPager2T;
                                cp31Var.e = watchFeedPagerIndicatorViewT;
                                cp31Var.f = constraintLayout;
                                viewPager2T.setAdapter(qxx0Var);
                                viewPager2T.b(new fs41(new kgr(this, (byte) 1)));
                                this.c = cp31Var;
                                i2r0 i2r0Var = new i2r0(viewPager2T);
                                this.d = i2r0Var;
                                viewPager2T.b(i2r0Var);
                                artworkViewT.setViewContext(new f47(gw70Var));
                                this.e = new rku();
                                eqq.t(-1, -2, constraintLayout);
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(gh7 gh7Var) {
        int scrollState = ((ViewPager2) this.c.d).getScrollState();
        rku rkuVar = this.e;
        if (scrollState == 0 && this.f) {
            rkuVar.b(Observable.timer(gh7Var.c, TimeUnit.MILLISECONDS).observeOn(this.a).subscribe(new lgr(this, gh7Var, (byte) 0)));
        } else {
            rkuVar.a();
        }
    }

    public final void b(int i, ArrayList arrayList) {
        String str;
        String str2;
        j17 s07Var;
        fh7 fh7Var = (fh7) o7h.t0(i, arrayList);
        cp31 cp31Var = this.c;
        TextView textView = (TextView) cp31Var.a;
        ArtworkView artworkView = (ArtworkView) cp31Var.b;
        if (fh7Var == null || (str = fh7Var.c) == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = (TextView) cp31Var.c;
        if (fh7Var == null || (str2 = fh7Var.d) == null) {
            str2 = "";
        }
        textView2.setText(str2);
        if ((fh7Var != null ? fh7Var.a : null) == null) {
            if ((fh7Var != null ? fh7Var.c : null) == null) {
                artworkView.setVisibility(8);
                return;
            }
        }
        int i2 = fh7Var.e;
        String str3 = fh7Var.a;
        int i3 = i2 == 0 ? -1 : jgr.a[l1d.C(i2)];
        if (i3 == -1) {
            s07Var = new s07(new g07(str3, new zz6(16.0f)), new rk70(2131232672));
        } else if (i3 == 1) {
            s07Var = new s07(new g07(str3), new rk70(u890.j(fh7Var.b, "enhance") ? 2131231785 : 2131232672));
        } else if (i3 == 2) {
            s07Var = new l07(new g07(str3), false);
        } else if (i3 == 3) {
            s07Var = new e17(new g07(str3, yz6.d));
        } else if (i3 != 4) {
            eg.o();
            return;
        } else {
            g07 g07Var = new g07(str3, xz6.d);
            String str4 = fh7Var.c;
            s07Var = new j17(str4 != null ? str4 : "", (String) null, g07Var);
        }
        artworkView.setPlaceholderBackgroundColor(ColorStateList.valueOf(0));
        artworkView.h(s07Var);
        artworkView.setVisibility(0);
    }

    public final void f(Object obj) {
        gh7 gh7Var = (gh7) obj;
        ArrayList arrayList = gh7Var.a;
        if (gh7Var.equals(this.g)) {
            return;
        }
        this.g = gh7Var;
        cp31 cp31Var = this.c;
        ViewPager2 viewPager2 = (ViewPager2) cp31Var.d;
        WatchFeedPagerIndicatorView watchFeedPagerIndicatorView = (WatchFeedPagerIndicatorView) cp31Var.e;
        viewPager2.setCurrentItem(0);
        ((ConstraintLayout) cp31Var.f).setContentDescription(gh7Var.d);
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new e9e1((String) it.next()));
        }
        this.b.C(arrayList2);
        if (arrayList.size() > 1) {
            watchFeedPagerIndicatorView.setVisibility(0);
            watchFeedPagerIndicatorView.O0 = viewPager2;
            i2k i2kVar = watchFeedPagerIndicatorView.i;
            if (i2kVar != null) {
                viewPager2.c.f(i2kVar);
            }
            i2k i2kVar2 = new i2k(watchFeedPagerIndicatorView, (byte) 2);
            viewPager2.b(i2kVar2);
            watchFeedPagerIndicatorView.i = i2kVar2;
            watchFeedPagerIndicatorView.a(arrayList.size());
        } else {
            watchFeedPagerIndicatorView.setVisibility(8);
        }
        b(viewPager2.getCurrentItem(), gh7Var.b);
    }

    public final View getView() {
        return (ConstraintLayout) this.c.f;
    }

    public final void n(iu30 iu30Var) {
        this.d.b = new m0o(iu30Var, (byte) 12);
    }
}
