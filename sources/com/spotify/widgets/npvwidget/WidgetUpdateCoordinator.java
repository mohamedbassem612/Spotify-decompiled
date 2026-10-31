package com.spotify.widgets.npvwidget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Iterator;
import kotlin.Metadata;
import p.giv;
import p.hiv;
import p.ila0;
import p.jw9;
import p.l1d;
import p.qol1;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/widgets/npvwidget/WidgetUpdateCoordinator;", "Lp/jw9;", "<init>", "()V", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class WidgetUpdateCoordinator extends jw9 {
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[EDGE_INSN: B:13:0x0029->B:14:0x002a BREAK  A[LOOP:0: B:8:0x0014->B:34:?]] */
    public final void a(Context context, Intent intent) {
        WidgetInteraction widgetInteraction;
        String action = intent.getAction();
        if (action == null) {
            action = null;
            break;
        }
        t0z t0zVar = qol1.i;
        if (!t0zVar.isEmpty()) {
            Iterator it = t0zVar.iterator();
            do {
                if (!it.hasNext()) {
                    action = null;
                    break;
                }
            } while (!((qol1) it.next()).a.equals(action));
        } else {
            action = null;
            break;
        }
        if (action == null) {
            Logger.k(l1d.m("Rejected unsafe action: ", intent.getAction()), new Object[0]);
            return;
        }
        Intent intent2 = new Intent(action);
        if (action.equals("com.spotify.widgets.widgets.ACTION_TOOLTIP")) {
            String stringExtra = intent.getStringExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE");
            if (stringExtra != null) {
                intent2.putExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE", stringExtra);
            }
        } else if (action.equals("com.spotify.widgets.widgets.ACTION_DISMISS_CAMPAIGN") && (widgetInteraction = (WidgetInteraction) ila0.s(intent, "com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", WidgetInteraction.class)) != null) {
            intent2.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", (Parcelable) widgetInteraction);
        }
        Iterator it2 = hiv.a().iterator();
        while (it2.hasNext()) {
            context.sendBroadcast(new Intent(intent2).setComponent(new ComponentName(context, ((giv) it2.next()).a())));
        }
    }
}
