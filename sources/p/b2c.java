package p;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.text.NumberFormat;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b2c {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public b2c(Context context, gw70 gw70Var, int i) {
        this.c = context;
        this.a = 2;
        View viewInflate = LayoutInflater.from(context).inflate(2131624479, (ViewGroup) null, false);
        int i2 = 2131427556;
        ArtworkView artworkViewT = m5n1.t(viewInflate, 2131427556);
        if (artworkViewT != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i2 = 2131428259;
            View viewT = m5n1.t(viewInflate, 2131428259);
            if (viewT != null) {
                ConstraintLayout constraintLayoutT = m5n1.t(viewT, 2131428258);
                if (constraintLayoutT == null) {
                    bhn0.i("Missing required view with ID: ".concat(viewT.getResources().getResourceName(2131428258)));
                    throw null;
                }
                int i3 = 2131427942;
                if (m5n1.t(constraintLayoutT, 2131427942) != null) {
                    i3 = 2131427944;
                    if (m5n1.t(constraintLayoutT, 2131427944) != null) {
                        i3 = 2131428402;
                        TextView textView = (TextView) m5n1.t(constraintLayoutT, 2131428402);
                        if (textView != null) {
                            i3 = 2131428403;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutT, 2131428403);
                            if (textView2 != null) {
                                i3 = 2131428498;
                                View viewT2 = m5n1.t(constraintLayoutT, 2131428498);
                                if (viewT2 != null) {
                                    i3 = 2131428499;
                                    View viewT3 = m5n1.t(constraintLayoutT, 2131428499);
                                    if (viewT3 != null) {
                                        i3 = 2131428500;
                                        View viewT4 = m5n1.t(constraintLayoutT, 2131428500);
                                        if (viewT4 != null) {
                                            i3 = 2131429141;
                                            TextView textView3 = (TextView) m5n1.t(constraintLayoutT, 2131429141);
                                            if (textView3 != null) {
                                                i3 = 2131429142;
                                                TextView textView4 = (TextView) m5n1.t(constraintLayoutT, 2131429142);
                                                if (textView4 != null) {
                                                    i3 = 2131429985;
                                                    TextView textView5 = (TextView) m5n1.t(constraintLayoutT, 2131429985);
                                                    if (textView5 != null) {
                                                        i3 = 2131429986;
                                                        TextView textView6 = (TextView) m5n1.t(constraintLayoutT, 2131429986);
                                                        if (textView6 != null) {
                                                            i3 = 2131430869;
                                                            TextView textView7 = (TextView) m5n1.t(constraintLayoutT, 2131430869);
                                                            if (textView7 != null) {
                                                                i3 = 2131430870;
                                                                TextView textView8 = (TextView) m5n1.t(constraintLayoutT, 2131430870);
                                                                if (textView8 != null) {
                                                                    fp8 fp8Var = new fp8((FrameLayout) viewT, new h72(constraintLayoutT, textView, textView2, viewT2, viewT3, viewT4, textView3, textView4, textView5, textView6, textView7, textView8), (byte) 28);
                                                                    i2 = 2131428261;
                                                                    ConstraintLayout constraintLayoutT2 = m5n1.t(viewInflate, 2131428261);
                                                                    if (constraintLayoutT2 != null) {
                                                                        i2 = 2131430471;
                                                                        FrameLayout frameLayout = (FrameLayout) m5n1.t(viewInflate, 2131430471);
                                                                        if (frameLayout != null) {
                                                                            lag lagVar = new lag(linearLayout, artworkViewT, fp8Var, constraintLayoutT2, frameLayout);
                                                                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                                                            layoutParams.setMargins(i, i, i, i);
                                                                            linearLayout.setLayoutParams(layoutParams);
                                                                            float dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033);
                                                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                                                            gradientDrawable.setColor(context.getColor(2131102455));
                                                                            gradientDrawable.setCornerRadius(dimensionPixelSize);
                                                                            linearLayout.setBackground(gradientDrawable);
                                                                            linearLayout.setClipToOutline(true);
                                                                            constraintLayoutT2.setMinHeight(linearLayout.getResources().getDimensionPixelSize(2131165571));
                                                                            artworkViewT.setViewContext(new f47(gw70Var));
                                                                            this.d = lagVar;
                                                                            this.b = context.getResources().getConfiguration().fontScale >= 1.6f;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i3)));
                throw null;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static final /* synthetic */ iu30 b(b2c b2cVar) {
        return (w94) b2cVar.c;
    }

    public static String e(long j) {
        try {
            String str = NumberFormat.getInstance().format(j);
            str.getClass();
            return str;
        } catch (Exception unused) {
            return String.valueOf(j);
        }
    }

    public gjl c() {
        return new gjl((e8o0) this.c, this.a, false, false, this.b, false, -1L, -1L, o7h.p1((LinkedHashSet) this.d));
    }

    public void d() {
        this.a = 0;
        this.b = true;
    }

    public int f() {
        return this.a;
    }

    public void g(mgc mgcVar, boolean z) {
        MotionEvent motionEvent = (MotionEvent) mgcVar.d;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a = mgcVar.b;
            this.b = false;
        } else if ((action == 1 || action == 2) && z) {
            d();
        }
        ((GestureDetector) this.d).onTouchEvent(motionEvent);
    }

    public void h(String str, sqm sqmVar) {
        lag lagVar = (lag) this.d;
        if ((this.b && this.a == 2) || str == null || str.length() == 0) {
            ((ArtworkView) lagVar.c).setVisibility(8);
            return;
        }
        ArtworkView artworkView = (ArtworkView) lagVar.c;
        artworkView.setVisibility(0);
        artworkView.h(new t07(new g07(str), true));
        if (sqmVar != null) {
            artworkView.setClickable(true);
            artworkView.setOnClickListener(new et1(sqmVar, (byte) 3));
        } else {
            artworkView.setClickable(false);
            artworkView.setOnClickListener(null);
        }
    }

    public void i() {
        this.a = 2;
        this.c = new e8o0((NetworkRequest) null);
    }

    public void j() {
        this.b = true;
    }

    public b2c(Context context, mcv0 mcv0Var, boolean z, int i) {
        this.c = context;
        this.d = mcv0Var;
        this.b = z;
        this.a = i;
    }

    public /* synthetic */ b2c(Context context, gw70 gw70Var) {
        this(context, gw70Var, context.getResources().getDimensionPixelSize(2131167023));
    }

    public b2c(Parcel parcel) {
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.c = jArr;
        parcel.readLongArray(jArr);
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, RemoteViews.CREATOR);
        for (int i2 = 0; i2 < i; i2++) {
            if (remoteViewsArr[i2] == null) {
                nkx0.m("null element found in ", remoteViewsArr, 46);
                throw null;
            }
        }
        this.d = remoteViewsArr;
        this.b = parcel.readInt() == 1;
        this.a = parcel.readInt();
    }

    public b2c() {
        this.c = new e8o0((NetworkRequest) null);
        this.a = 1;
        this.d = new LinkedHashSet();
    }

    public b2c(boolean z, int i, String str, Bundle bundle) {
        this.b = z;
        this.a = i;
        this.c = str;
        this.d = bundle == null ? Bundle.EMPTY : bundle;
    }

    public b2c(Context context, w94 w94Var) {
        this.c = w94Var;
        this.a = 0;
        this.d = new GestureDetector(context, (GestureDetector.OnGestureListener) new wa80(this));
    }
}
