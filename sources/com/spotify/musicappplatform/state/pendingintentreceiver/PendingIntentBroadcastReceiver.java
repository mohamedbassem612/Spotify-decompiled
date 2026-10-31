package com.spotify.musicappplatform.state.pendingintentreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p.atp0;
import p.ca41;
import p.ck10;
import p.egs0;
import p.ez1;
import p.fdg1;
import p.fgs0;
import p.gyq0;
import p.iu30;
import p.iy1;
import p.j1e1;
import p.jfv;
import p.keu;
import p.ngv;
import p.ntf0;
import p.os;
import p.ozp0;
import p.qvy0;
import p.shq0;
import p.u890;
import p.wvq0;
import p.wvr0;
import p.xjb1;
import p.ytw0;
import p.yvu;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/musicappplatform/state/pendingintentreceiver/PendingIntentBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "src_main_java_com_spotify_musicappplatform_state_pendingintentreceiver-pendingintentreceiver"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class PendingIntentBroadcastReceiver extends BroadcastReceiver {
    public static final long c;
    public zn41 a;
    public zn41 b;

    static {
        ytw0 ytw0Var = jfv.b;
        c = fdg1.k0(8, ngv.e);
    }

    public final zn41 a() {
        zn41 zn41Var = this.a;
        if (zn41Var != null) {
            return zn41Var;
        }
        u890.C("sessionScopeWorkDispatcher");
        throw null;
    }

    public final void b(zn41 zn41Var, String str, iu30 iu30Var) {
        shq0 shq0Var = new shq0(new AtomicBoolean(false), goAsync(), (byte) 18);
        zn41Var.b(str, c, new gyq0(shq0Var, (byte) 26), new ozp0(iu30Var, shq0Var, (byte) 26));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:128:0x021a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b  */
    /* JADX WARN: Code duplicated, block: B:136:0x023a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0242  */
    /* JADX WARN: Code duplicated, block: B:141:0x0251  */
    /* JADX WARN: Code duplicated, block: B:144:0x0259  */
    /* JADX WARN: Code duplicated, block: B:146:0x0268  */
    /* JADX WARN: Code duplicated, block: B:148:0x026e  */
    /* JADX WARN: Code duplicated, block: B:150:0x027d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0285  */
    /* JADX WARN: Code duplicated, block: B:155:0x0294  */
    /* JADX WARN: Code duplicated, block: B:158:0x029c  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02de  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:94:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        Object obj2;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        String stringExtra5;
        String str;
        j1e1.s(this, context);
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2077703858:
                    if (action.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_CHANGE_SEGMENT")) {
                        b(a(), action, egs0.e);
                        return;
                    }
                    return;
                case -1925474541:
                    obj = "com.spotify.nowplaying.pip.SEEK_BACK_15_SEC";
                    if (!action.equals(obj)) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1925474541:
                            if (action.equals(obj)) {
                                b(a(), action, egs0.c);
                                return;
                            }
                            return;
                        case -1041978581:
                            if (action.equals("com.spotify.nowplaying.pip.SEEK_FORWARD_15_SEC")) {
                                b(a(), action, egs0.d);
                                return;
                            }
                            return;
                        case -810043495:
                            if (action.equals("com.spotify.nowplaying.pip.RESUME")) {
                                b(a(), action, wvr0.e1);
                                return;
                            }
                            return;
                        case 1634473194:
                            if (action.equals("com.spotify.nowplaying.pip.PAUSE")) {
                                b(a(), action, egs0.b);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                case -1755005516:
                    obj2 = "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC";
                    if (!action.equals(obj2)) {
                        return;
                    }
                    stringExtra = intent.getStringExtra("mode");
                    if (stringExtra == null) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1755005516:
                            if (action.equals(obj2)) {
                                b(a(), action, new atp0(stringExtra, (byte) 16));
                                return;
                            }
                            return;
                        case -972203213:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                                b(a(), action, new atp0(stringExtra, (byte) 12));
                                return;
                            }
                            return;
                        case -12633488:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                                b(a(), action, new atp0(stringExtra, (byte) 11));
                                return;
                            }
                            return;
                        case 1241066640:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                                b(a(), action, new atp0(stringExtra, (byte) 14));
                                return;
                            }
                            return;
                        case 1241138128:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                                b(a(), action, new atp0(stringExtra, (byte) 13));
                                return;
                            }
                            return;
                        case 1859828010:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                                b(a(), action, new atp0(stringExtra, (byte) 15));
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                case -1505412510:
                    if (!action.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION")) {
                        return;
                    }
                    stringExtra2 = intent.getStringExtra("uri");
                    if (stringExtra2 == null && (stringExtra3 = intent.getStringExtra("mode")) != null) {
                        stringExtra4 = intent.getStringExtra("context_source");
                        if (stringExtra4 == null) {
                            stringExtra4 = "";
                        }
                        stringExtra5 = intent.getStringExtra(ContextTrack$Metadata.KEY_PROVIDER);
                        if (stringExtra5 == null) {
                            str = "";
                        } else {
                            str = stringExtra5;
                        }
                        switch (action) {
                            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION":
                                b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 23));
                                return;
                            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_ADD_TO_COLLECTION":
                                b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 22));
                                return;
                            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_BAN":
                                b(a(), action, new ntf0((byte) 24, (Object) stringExtra2, (Object) stringExtra4, (Object) str, stringExtra3));
                                return;
                            case "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_UNBAN":
                                b(a(), action, new ck10(stringExtra3, stringExtra2, stringExtra4, (byte) 1));
                                return;
                            default:
                                return;
                        }
                    }
                    return;
                case -1041978581:
                    if (!action.equals("com.spotify.nowplaying.pip.SEEK_FORWARD_15_SEC")) {
                        return;
                    }
                    obj = "com.spotify.nowplaying.pip.SEEK_BACK_15_SEC";
                    switch (action.hashCode()) {
                        case -1925474541:
                            if (action.equals(obj)) {
                                return;
                            }
                            b(a(), action, egs0.c);
                            return;
                        case -1041978581:
                            if (action.equals("com.spotify.nowplaying.pip.SEEK_FORWARD_15_SEC")) {
                                return;
                            }
                            b(a(), action, egs0.d);
                            return;
                        case -810043495:
                            if (action.equals("com.spotify.nowplaying.pip.RESUME")) {
                                return;
                            }
                            b(a(), action, wvr0.e1);
                            return;
                        case 1634473194:
                            if (action.equals("com.spotify.nowplaying.pip.PAUSE")) {
                                return;
                            }
                            b(a(), action, egs0.b);
                            return;
                        default:
                            return;
                    }
                case -972203213:
                    if (!action.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                        return;
                    }
                    obj2 = "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC";
                    stringExtra = intent.getStringExtra("mode");
                    if (stringExtra == null) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1755005516:
                            if (action.equals(obj2)) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 16));
                            return;
                        case -972203213:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 12));
                            return;
                        case -12633488:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                                b(a(), action, new atp0(stringExtra, (byte) 11));
                                return;
                            }
                            return;
                        case 1241066640:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 14));
                            return;
                        case 1241138128:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 13));
                            return;
                        case 1859828010:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 15));
                            return;
                        default:
                            return;
                    }
                case -810043495:
                    if (!action.equals("com.spotify.nowplaying.pip.RESUME")) {
                        return;
                    }
                    obj = "com.spotify.nowplaying.pip.SEEK_BACK_15_SEC";
                    switch (action.hashCode()) {
                        case -1925474541:
                            if (action.equals(obj)) {
                                return;
                            }
                            b(a(), action, egs0.c);
                            return;
                        case -1041978581:
                            if (action.equals("com.spotify.nowplaying.pip.SEEK_FORWARD_15_SEC")) {
                                return;
                            }
                            b(a(), action, egs0.d);
                            return;
                        case -810043495:
                            if (action.equals("com.spotify.nowplaying.pip.RESUME")) {
                                return;
                            }
                            b(a(), action, wvr0.e1);
                            return;
                        case 1634473194:
                            if (action.equals("com.spotify.nowplaying.pip.PAUSE")) {
                                return;
                            }
                            b(a(), action, egs0.b);
                            return;
                        default:
                            return;
                    }
                case -12633488:
                    if (!action.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                        return;
                    }
                    obj2 = "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC";
                    stringExtra = intent.getStringExtra("mode");
                    if (stringExtra == null) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1755005516:
                            if (action.equals(obj2)) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 16));
                            return;
                        case -972203213:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 12));
                            return;
                        case -12633488:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                                b(a(), action, new atp0(stringExtra, (byte) 11));
                                return;
                            }
                            return;
                        case 1241066640:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 14));
                            return;
                        case 1241138128:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 13));
                            return;
                        case 1859828010:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 15));
                            return;
                        default:
                            return;
                    }
                case 25062146:
                    if (action.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS")) {
                        qvy0 parcelableExtra = intent.getParcelableExtra("push_data");
                        if (parcelableExtra instanceof ca41) {
                            b(a(), "Save entity notification action", new wvq0((ca41) parcelableExtra, (byte) 26));
                            return;
                        }
                        if (parcelableExtra instanceof keu) {
                            b(a(), "Dismiss notification action", new wvq0((keu) parcelableExtra, (byte) 27));
                            return;
                        }
                        if (parcelableExtra instanceof iy1) {
                            b(a(), "Add to queue notification action", new wvq0((iy1) parcelableExtra, (byte) 28));
                            return;
                        }
                        if (parcelableExtra instanceof yvu) {
                            b(a(), "Download entity notification action", new wvq0((yvu) parcelableExtra, (byte) 29));
                            return;
                        }
                        byte b = 0;
                        if (parcelableExtra instanceof xjb1) {
                            b(a(), "Start playback notification action", new fgs0((xjb1) parcelableExtra, b));
                            return;
                        } else if (parcelableExtra instanceof ez1) {
                            b(a(), "Add to your episode notification action", new fgs0((ez1) parcelableExtra, (byte) 1));
                            return;
                        } else {
                            Logger.b("Unsupported PushNotificationAction: ".concat(parcelableExtra != null ? parcelableExtra.getClass().getSimpleName() : "null"), new Object[0]);
                            return;
                        }
                    }
                    return;
                case 118468000:
                    if (action.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_SHUTDOWN")) {
                        zn41 zn41Var = this.b;
                        if (zn41Var != null) {
                            b(zn41Var, action, egs0.f);
                            return;
                        } else {
                            u890.C("deferredScopeWorkDispatcher");
                            throw null;
                        }
                    }
                    return;
                case 704335770:
                    if (!action.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_ADD_TO_COLLECTION")) {
                        return;
                    }
                    stringExtra2 = intent.getStringExtra("uri");
                    if (stringExtra2 == null) {
                        return;
                    }
                    stringExtra4 = intent.getStringExtra("context_source");
                    if (stringExtra4 == null) {
                        stringExtra4 = "";
                    }
                    stringExtra5 = intent.getStringExtra(ContextTrack$Metadata.KEY_PROVIDER);
                    if (stringExtra5 == null) {
                        str = "";
                    } else {
                        str = stringExtra5;
                    }
                    switch (action) {
                        case -1505412510:
                            b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 23));
                            return;
                        case 704335770:
                            b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 22));
                            return;
                        case 1646813797:
                            b(a(), action, new ntf0((byte) 24, (Object) stringExtra2, (Object) stringExtra4, (Object) str, stringExtra3));
                            return;
                        case 2058018732:
                            b(a(), action, new ck10(stringExtra3, stringExtra2, stringExtra4, (byte) 1));
                            return;
                        default:
                            return;
                    }
                case 1241066640:
                    if (!action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                        return;
                    }
                    obj2 = "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC";
                    stringExtra = intent.getStringExtra("mode");
                    if (stringExtra == null) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1755005516:
                            if (action.equals(obj2)) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 16));
                            return;
                        case -972203213:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 12));
                            return;
                        case -12633488:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                                b(a(), action, new atp0(stringExtra, (byte) 11));
                                return;
                            }
                            return;
                        case 1241066640:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 14));
                            return;
                        case 1241138128:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 13));
                            return;
                        case 1859828010:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 15));
                            return;
                        default:
                            return;
                    }
                case 1241138128:
                    if (!action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                        return;
                    }
                    obj2 = "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC";
                    stringExtra = intent.getStringExtra("mode");
                    if (stringExtra == null) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1755005516:
                            if (action.equals(obj2)) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 16));
                            return;
                        case -972203213:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 12));
                            return;
                        case -12633488:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                                b(a(), action, new atp0(stringExtra, (byte) 11));
                                return;
                            }
                            return;
                        case 1241066640:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 14));
                            return;
                        case 1241138128:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 13));
                            return;
                        case 1859828010:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 15));
                            return;
                        default:
                            return;
                    }
                case 1634473194:
                    if (!action.equals("com.spotify.nowplaying.pip.PAUSE")) {
                        return;
                    }
                    obj = "com.spotify.nowplaying.pip.SEEK_BACK_15_SEC";
                    switch (action.hashCode()) {
                        case -1925474541:
                            if (action.equals(obj)) {
                                return;
                            }
                            b(a(), action, egs0.c);
                            return;
                        case -1041978581:
                            if (action.equals("com.spotify.nowplaying.pip.SEEK_FORWARD_15_SEC")) {
                                return;
                            }
                            b(a(), action, egs0.d);
                            return;
                        case -810043495:
                            if (action.equals("com.spotify.nowplaying.pip.RESUME")) {
                                return;
                            }
                            b(a(), action, wvr0.e1);
                            return;
                        case 1634473194:
                            if (action.equals("com.spotify.nowplaying.pip.PAUSE")) {
                                return;
                            }
                            b(a(), action, egs0.b);
                            return;
                        default:
                            return;
                    }
                case 1646813797:
                    if (!action.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_BAN")) {
                        return;
                    }
                    stringExtra2 = intent.getStringExtra("uri");
                    if (stringExtra2 == null) {
                        return;
                    }
                    stringExtra4 = intent.getStringExtra("context_source");
                    if (stringExtra4 == null) {
                        stringExtra4 = "";
                    }
                    stringExtra5 = intent.getStringExtra(ContextTrack$Metadata.KEY_PROVIDER);
                    if (stringExtra5 == null) {
                        str = "";
                    } else {
                        str = stringExtra5;
                    }
                    switch (action) {
                        case -1505412510:
                            b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 23));
                            return;
                        case 704335770:
                            b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 22));
                            return;
                        case 1646813797:
                            b(a(), action, new ntf0((byte) 24, (Object) stringExtra2, (Object) stringExtra4, (Object) str, stringExtra3));
                            return;
                        case 2058018732:
                            b(a(), action, new ck10(stringExtra3, stringExtra2, stringExtra4, (byte) 1));
                            return;
                        default:
                            return;
                    }
                case 1859828010:
                    if (!action.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                        return;
                    }
                    obj2 = "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC";
                    stringExtra = intent.getStringExtra("mode");
                    if (stringExtra == null) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1755005516:
                            if (action.equals(obj2)) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 16));
                            return;
                        case -972203213:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.PAUSE")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 12));
                            return;
                        case -12633488:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.RESUME")) {
                                b(a(), action, new atp0(stringExtra, (byte) 11));
                                return;
                            }
                            return;
                        case 1241066640:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 14));
                            return;
                        case 1241138128:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 13));
                            return;
                        case 1859828010:
                            if (action.equals("com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC")) {
                                return;
                            }
                            b(a(), action, new atp0(stringExtra, (byte) 15));
                            return;
                        default:
                            return;
                    }
                case 2058018732:
                    if (!action.equals("com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_UNBAN")) {
                        return;
                    }
                    stringExtra2 = intent.getStringExtra("uri");
                    if (stringExtra2 == null) {
                        return;
                    }
                    stringExtra4 = intent.getStringExtra("context_source");
                    if (stringExtra4 == null) {
                        stringExtra4 = "";
                    }
                    stringExtra5 = intent.getStringExtra(ContextTrack$Metadata.KEY_PROVIDER);
                    if (stringExtra5 == null) {
                        str = "";
                    } else {
                        str = stringExtra5;
                    }
                    switch (action) {
                        case -1505412510:
                            b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 23));
                            return;
                        case 704335770:
                            b(a(), action, new os(stringExtra3, stringExtra2, stringExtra4, (byte) 22));
                            return;
                        case 1646813797:
                            b(a(), action, new ntf0((byte) 24, (Object) stringExtra2, (Object) stringExtra4, (Object) str, stringExtra3));
                            return;
                        case 2058018732:
                            b(a(), action, new ck10(stringExtra3, stringExtra2, stringExtra4, (byte) 1));
                            return;
                        default:
                            return;
                    }
                default:
                    return;
            }
        }
    }
}
