package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xag {
    public static final Set a = f46.S0(new String[]{"spclient.wg.spotify.com", "nearby.spotify.net"});
    public static final Set b = f46.S0(new String[]{"encore.scdn.co", "editorial-worlds.spotifycdn.com", "i.scdn.co", "pickasso.spotifycdn.com"});
    public static final Set c = f46.S0(new String[]{"javascript", "data", "file", "blob", "content"});

    public static final void a(String str, String str2, gag gagVar, csj1 csj1Var, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        float f;
        int iI0;
        boolean z3;
        boolean z4;
        tob1 tob1Var;
        boolean z5;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1366727708);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(gagVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(csj1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.h(z) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var2.i(nim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.h(z2) ? 1048576 : 524288;
        }
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var2.T();
            if (objT == obj) {
                objT = v8r.q(Boolean.TRUE);
                x340Var2.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            wat watVar = (wat) x340Var2.k(t4k.h);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).a.c;
            int iG = z4p1.G(j);
            int i4 = i2;
            Object objT2 = x340Var2.T();
            if (objT2 == obj) {
                try {
                    int identifier = context.getResources().getIdentifier("floating_now_playing_bar_height", "dimen", context.getPackageName());
                    if (identifier != 0) {
                        iI0 = context.getResources().getDimensionPixelSize(identifier);
                    } else {
                        f = 56.0f;
                        try {
                            iI0 = watVar.i0(56.0f);
                        } catch (Exception unused) {
                            iI0 = watVar.i0(f);
                        }
                    }
                } catch (Exception unused2) {
                    f = 56.0f;
                }
                objT2 = Integer.valueOf(iI0);
                x340Var2.s0(objT2);
            }
            int iIntValue = ((Number) objT2).intValue();
            u85 u85Var = (erl1) x340Var2.k(szf0.b);
            if (u85Var == null) {
                x340Var2.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var2).g;
                z3 = false;
            } else {
                z3 = false;
                x340Var2.i0(-241885792);
            }
            x340Var2.r(z3);
            int iC = u85Var.c(watVar);
            int iD = u85Var.d(watVar) - iIntValue;
            if (iD < 0) {
                iD = 0;
            }
            Object objT3 = x340Var2.T();
            if (objT3 == obj) {
                objT3 = "\n(function() {\n  'use strict';\n  if (window._genUiResolve) return;\n\n  var authorizedHosts = [" + o7h.y0(o7h.Z0(a), ", ", (String) null, (String) null, tzf.t, 30) + "];\n  var bridgeVersion = 5;\n  var videoPlaybackEnabled = " + z2 + ";\n\n  var callbacks = {};\n  var TIMEOUT_MS = 10000;\n\n  function generateCallbackId() {\n    var arr = new Uint32Array(2);\n    crypto.getRandomValues(arr);\n    return 'cb_' + arr[0].toString(36) + arr[1].toString(36);\n  }\n\n  Object.defineProperty(window, '_genUiResolve', {\n    value: Object.freeze(function(id, value) {\n      var cb = callbacks[id];\n      if (typeof cb === 'function') {\n        delete callbacks[id];\n        cb(value);\n      }\n    }),\n    writable: false,\n    enumerable: false,\n    configurable: false\n  });\n\n  function callNativeAsync(target, method, args) {\n    return new Promise(function(resolve, reject) {\n      var callbackId = generateCallbackId();\n      var timer = setTimeout(function() {\n        delete callbacks[callbackId];\n        console.warn('callNative(' + method + ') timed out');\n        resolve(undefined);\n      }, TIMEOUT_MS);\n      callbacks[callbackId] = function(value) {\n        clearTimeout(timer);\n        delete callbacks[callbackId];\n        resolve(value);\n      };\n      target[method].apply(target, args.concat([callbackId]));\n    });\n  }\n\n  if (window.genUiNative) {\n    var orig = window.genUiNative;\n    Object.defineProperty(window, '_genUiNativeRaw', {\n      value: orig,\n      writable: false,\n      enumerable: false,\n      configurable: false\n    });\n\n    // Collection hooks are content-type aware and behave identically to iOS:\n    // saveToCollection/removeFromCollection route each URI to the right action\n    // natively (saveable -> add-to-playlist sheet; artist/show -> follow;\n    // album -> library; prerelease -> pre-save; concert/venue/concert-campaign\n    // -> interested), and every mutation surfaces a confirmation snackbar.\n    // getCollectionState resolves to one of:\n    //   'none' | 'saved' | 'followed' | 'presaved' | 'interested' | 'banned'.\n    var methods = ['navigate', 'closePage', 'playBetamax', 'stopBetamax', 'playUri',\n      'pausePlayback', 'saveToCollection', 'removeFromCollection',\n      'subscribeToPlayerState', 'stopPlayback'];\n    if (videoPlaybackEnabled) methods.push('playVideo');\n\n    var api = {\n      getBridgeVersion: function() { return bridgeVersion; },\n      getCapabilities: function() { return methods.concat(['getBridgeVersion', 'getCapabilities', 'getBottomInset', 'isCurrentlyPlaying', 'getCollectionState', 'showContextMenu', 'hasPreciseLocationPermission', 'requestPreciseLocationPermission']); },\n      getBottomInset: function() { return Promise.resolve(orig.getBottomInset()); },\n      isCurrentlyPlaying: function(uri) { return callNativeAsync(orig, 'isCurrentlyPlayingAsync', [uri]); },\n      getCollectionState: function(uri) { return callNativeAsync(orig, 'getCollectionStateAsync', [uri]); },\n      showContextMenu: function(uri) { orig.showContextMenu(uri); },\n      // Precise-location hooks. hasPreciseLocationPermission is a pure read (resolves\n      // true/false, never prompts). requestPreciseLocationPermission runs the full\n      // consent page + OS dialog and resolves to whether precise location is granted.\n      // Neither returns coordinates: a granted location is written to user-geo-points\n      // and consumed server-side. Both resolve false when the location capability is\n      // disabled via remote config.\n      hasPreciseLocationPermission: function() { return callNativeAsync(orig, 'hasPreciseLocationPermissionAsync', []); },\n      requestPreciseLocationPermission: function() { return callNativeAsync(orig, 'requestPreciseLocationPermissionAsync', []); },\n      // Best-effort, non-security: drop playUri before the user has ever interacted\n      // with the page (blocks on-load autoplay). Bypassable via _genUiNativeRaw;\n      // the real controls are native (rate limit + type/format validation).\n      playUri: function(uri) {\n        if (!navigator.userActivation || !navigator.userActivation.hasBeenActive) {\n          console.warn('genUiNative.playUri ignored: no user interaction yet');\n          return;\n        }\n        orig.playUri(uri);\n      }\n    };\n    // playVideo plays a track, episode or podcast chapter with video and opens the fullscreen player.\n    // Same best-effort activation guard as playUri.\n    if (videoPlaybackEnabled) {\n      api.playVideo = function(uri) {\n        if (!navigator.userActivation || !navigator.userActivation.hasBeenActive) {\n          console.warn('genUiNative.playVideo ignored: no user interaction yet');\n          return;\n        }\n        orig.playVideo(uri);\n      };\n    }\n\n    methods.forEach(function(name) {\n      if (!api[name]) {\n        var fn = orig[name];\n        if (typeof fn === 'function') {\n          api[name] = fn.bind(orig);\n        }\n      }\n    });\n\n    Object.defineProperty(window, 'genUiNative', {\n      value: Object.freeze(api),\n      writable: false,\n      enumerable: false,\n      configurable: false\n    });\n  }\n\n  if (window.genUiNative && window.genUiNative.subscribeToPlayerState) {\n    window.genUiNative.subscribeToPlayerState();\n  }\n})();\n";
                x340Var2.s0(objT3);
            }
            String str3 = (String) objT3;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarW = uyn1.w(dug.f(qim0VarD, j, u5j1Var), uyn1.j(0.0f, iC / watVar.h(), 0.0f, iD / watVar.h(), 5));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z6 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            Object objT4 = x340Var2.T();
            if (objT4 == obj) {
                objT4 = v8r.q((Object) null);
                x340Var2.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            boolean zI = x340Var2.i(ven0Var) | x340Var2.i(gagVar);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == obj) {
                objT5 = new w9f(gagVar, ven0Var, (byte) 12);
                x340Var2.s0(objT5);
            }
            qxd0.i(rih1.a, (iu30) objT5, x340Var2);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
            boolean zE = ((i4 & 57344) == 16384) | x340Var2.e(iG) | x340Var2.i(gagVar) | ((i4 & 112) == 32) | x340Var2.i(csj1Var) | x340Var2.i(tob1Var2) | ((i4 & 14) == 4) | x340Var2.i(ven0Var);
            Object objT6 = x340Var2.T();
            if (zE || objT6 == obj) {
                z4 = false;
                tob1Var = tob1Var2;
                vag vagVar = new vag(z, iG, gagVar, str, str2, str3, csj1Var, tob1Var, ven0Var);
                x340Var2.s0(vagVar);
                objT6 = vagVar;
            } else {
                tob1Var = tob1Var2;
                z4 = false;
            }
            x340Var = x340Var2;
            dm5.a((iu30) objT6, qim0VarD3, (iu30) null, x340Var, 0, 4);
            x340Var.r(true);
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                x340Var.i0(518174390);
                qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14), u5j1Var);
                gfh0 gfh0VarC2 = t1c.c(een.h, z4);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                xto1.e(null, 0, 0L, 0L, x340Var, 0, 15);
                x340Var = x340Var;
                z5 = true;
                x340Var.r(true);
                x340Var.r(z4);
            } else {
                z5 = true;
                x340Var.i0(518368512);
                x340Var.r(z4);
            }
            x340Var.r(z5);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(str, str2, gagVar, csj1Var, z, z2, i);
        }
    }
}
