package com.spotify.creativeworkplatform.encore.elements.releasedate;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.mxr;
import p.so11;
import p.tlv;
import p.to11;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\u000b\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/releasedate/ReleaseDateView;", "Lcom/spotify/encoremobile/component/textview/EncoreTextView;", "Lp/tlv;", "Lp/so11;", "Lp/rih1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lp/to11;", "N0", "Lp/to11;", "getViewContext", "()Lp/to11;", "setViewContext", "(Lp/to11;)V", "viewContext", "src_main_java_com_spotify_creativeworkplatform_encore_elements_releasedate-releasedate"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReleaseDateView extends EncoreTextView implements tlv {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public to11 viewContext;
    public Calendar i;
    public Calendar t;

    /* JADX WARN: Multi-variable type inference failed */
    public ReleaseDateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        this.viewContext = new to11(Calendar.getInstance());
        setId(2131430630);
        setTextAppearance(2132018006);
    }

    public final to11 getViewContext() {
        return this.viewContext;
    }

    public final void setViewContext(to11 to11Var) {
        this.viewContext = to11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void f(so11 so11Var) {
        String string;
        int i;
        long jLongValue = so11Var.a.longValue();
        Calendar calendar = this.viewContext.a;
        this.i = calendar;
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeInMillis(TimeUnit.SECONDS.toMillis(jLongValue));
        this.t = calendar2;
        Context context = getContext();
        Calendar calendar3 = this.i;
        if (calendar3 == null) {
            u890.C("todayCalendar");
            throw null;
        }
        mxr mxrVar = new mxr(context, calendar3);
        Calendar calendar4 = this.t;
        if (calendar4 == null) {
            u890.C("releaseCalendar");
            throw null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) mxrVar.d;
        if (mxrVar.u(calendar4) && calendar3.get(6) == calendar4.get(6)) {
            string = context.getString(2131961040);
        } else if (calendar4.getTimeInMillis() > calendar3.getTimeInMillis()) {
            string = context.getString(2131961039, simpleDateFormat.format(calendar4.getTime()));
        } else if (mxrVar.u(calendar4) && calendar3.get(6) - calendar4.get(6) == 1) {
            string = context.getString(2131961041);
        } else if (!mxrVar.u(calendar4) || (i = calendar3.get(6) - calendar4.get(6)) < 0 || i >= 8) {
            string = mxrVar.u(calendar4) ? ((SimpleDateFormat) mxrVar.c).format(calendar4.getTime()) : simpleDateFormat.format(calendar4.getTime());
        } else {
            string = ((SimpleDateFormat) mxrVar.b).format(calendar4.getTime());
        }
        setText(string);
        setVisibility(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReleaseDateView(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ ReleaseDateView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
