package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.interapp.service.IapException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class jf11 implements h8q0, yg30, qq70, Function, w0s0, se21, SingleOnSubscribe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jf11(h9d0 h9d0Var, if11 if11Var) {
        this.a = (byte) 0;
        this.b = h9d0Var;
    }

    public void a(fm61 fm61Var) {
        FlowableEmitter flowableEmitter = (FlowableEmitter) this.b;
        try {
            ByteBuffer byteBufferD = ((ye30) fm61Var).b.r0()[0].d();
            int i = fm61Var.f;
            int i2 = fm61Var.g;
            int i3 = i * i2;
            byte[] bArr = new byte[(i3 * 3) / 2];
            int[] iArr = new int[i3];
            byteBufferD.asIntBuffer().get(iArr);
            dem1.w(bArr, iArr, i, i2);
            flowableEmitter.onNext(new u141(bArr, i, i2));
        } finally {
            fm61Var.close();
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                Uri uri = (Uri) obj2;
                a1f1 a1f1Var = (b1f1) obj;
                if (!(a1f1Var instanceof a1f1)) {
                    return uri;
                }
                String str = a1f1Var.a.a;
                if (TextUtils.isEmpty(str)) {
                    return uri;
                }
                Uri.Builder builderBuildUpon = Uri.parse("https://accounts.spotify.com/login/ott/v2").buildUpon();
                builderBuildUpon.encodedFragment("token=".concat(str));
                return builderBuildUpon.build();
            default:
                return new ft5(((jr5) obj2).b, (Boolean) obj, Boolean.TRUE);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: android.content.Intent
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: android.content.Intent
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v6 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v6 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v6 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v6 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v15 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v15 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: android.content.Intent
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: android.content.Intent
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 android.content.Intent, new type: android.content.Intent
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public boolean b(int i, int i2, Intent intent) {
        int i3;
        Intent intentB;
        String strConcat;
        CharSequence stringExtra;
        String str;
        String stringExtra2;
        String str2;
        int i4;
        vrv0 vrv0Var = (vrv0) this.b;
        w741 w741Var = (w741) vrv0Var.c;
        boolean z = vrv0Var.b;
        int[] iArrH = l1d.H(3);
        int length = iArrH.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrH[i5];
            if (i3 == 1) {
                i4 = 1212;
            } else if (i3 == 2) {
                i4 = 1213;
            } else {
                if (i3 != 3) {
                    throw null;
                }
                i4 = 1214;
            }
            if (i == i4) {
                break;
            }
            i5++;
        }
        if (i3 == 0) {
            return false;
        }
        if (i2 != -1) {
            String stringExtra3 = intent == 0 ? "" : intent.getStringExtra("error_code");
            Locale locale = Locale.US;
            if (i3 == 1) {
                str2 = "LOGIN";
            } else if (i3 == 2) {
                str2 = "DISCLAIMER";
            } else {
                if (i3 != 3) {
                    throw 0;
                }
                str2 = "TOKEN";
            }
            vrv0Var.e("Samsung " + str2 + " returns not OK: " + stringExtra3);
            return true;
        }
        int iC = l1d.C(i3);
        if (iC == 0) {
            w741Var.getClass();
            Intent intentB2 = w741.b("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT");
            intentB2.putExtra("progress_theme", "dark");
            vrv0Var.g(intentB2, 1213);
            return true;
        }
        if (iC == 1) {
            String[] strArr = w741.b;
            if (z) {
                w741Var.getClass();
                intentB = w741.b("com.samsung.android.samsungaccount.action.REQUEST_AUTHCODE");
                intentB.putExtra("additional", strArr);
                intentB.putExtra("progress_theme", "dark");
            } else {
                spq0 spq0Var = (spq0) vrv0Var.f;
                w741Var.getClass();
                intentB = w741.b("com.msc.action.samsungaccount.REQUEST_ACCESSTOKEN");
                if (spq0Var.c()) {
                    intentB.putExtra("expired_access_token", (String) spq0Var.b());
                }
                intentB.putExtra("additional", strArr);
                intentB.putExtra("progress_theme", "dark");
            }
            vrv0Var.g(intentB, 1214);
            return true;
        }
        if (iC == 2) {
            if (intent != 0) {
                ArrayList arrayList = new ArrayList(0);
                if (!z && !intent.hasExtra("access_token")) {
                    arrayList.add("access_token");
                }
                if (z && !intent.hasExtra("authcode")) {
                    arrayList.add("authcode");
                }
                if (!intent.hasExtra("auth_server_url")) {
                    arrayList.add("auth_server_url");
                }
                if (!intent.hasExtra("api_server_url")) {
                    arrayList.add("api_server_url");
                }
                if (arrayList.isEmpty()) {
                    strConcat = r12;
                } else {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) ", ");
                        }
                    }
                    strConcat = "Intent extra doesn't contain: ".concat(sb.toString());
                }
            } else {
                strConcat = "Intent is null";
            }
            if (!jhc1.F(strConcat)) {
                vrv0Var.e(strConcat);
                return true;
            }
            if (intent != 0) {
                if (z) {
                    str = r12;
                } else {
                    stringExtra = intent.getStringExtra("access_token");
                }
                if (z) {
                    str = stringExtra;
                    stringExtra2 = intent.getStringExtra("authcode");
                } else {
                    str = stringExtra;
                    stringExtra2 = r12;
                }
                vrv0Var.f = spq0.a(str);
                Iterator it2 = new ArrayList((ArrayList) vrv0Var.e).iterator();
                while (it2.hasNext()) {
                    ((SingleEmitter) it2.next()).onSuccess(new c841(str, stringExtra2, intent.getStringExtra("auth_server_url"), intent.getStringExtra("api_server_url")));
                }
            }
        }
        return true;
    }

    public Object c(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 12:
                jbq jbqVar = (jbq) obj3;
                qop qopVar = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar = jbqVar.a;
                teq teqVar = jbqVar.b;
                k3q k3qVar = new k3q(daqVar, teqVar);
                qopVar.getClass();
                jbtVar.getClass();
                byp bypVar = new byp(k3qVar, qopVar, jbtVar);
                koc0 koc0Var = jbtVar.d;
                d0r d0rVar = jbtVar.b;
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                c8o.l(lzn0Var);
                u9c0 u9c0VarL = bypVar.l();
                String strD = qopVar.d();
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                ykq ykqVar = (ykq) bypVar.e;
                ykq ykqVar2 = (ykq) bypVar.f;
                waz0 waz0Var = (waz0) daqVar.Kc.get();
                c8o.l(waz0Var);
                return new ju51(koc0Var, d0rVar, lzn0Var, u9c0VarL, strD, context, ykqVar, ykqVar2, waz0Var, (ykq) bypVar.h, (ykq) bypVar.i, (cpq) ((jly0) bypVar.a).get());
            case 13:
                l3q l3qVar = (l3q) obj3;
                zbt zbtVar = (zbt) obj2;
                daq daqVar2 = l3qVar.a;
                teq teqVar2 = l3qVar.b;
                ((qop) obj).getClass();
                zbtVar.getClass();
                rzq rzqVar = zbtVar.a;
                c8o.l(rzqVar);
                i8h1 i8h1Var = (i8h1) daqVar2.A5.get();
                c8o.l(i8h1Var);
                return new tx51(rzqVar, new ov80(i8h1Var, zbtVar.e), teqVar2.H());
            case 14:
                act actVar = (act) obj2;
                daq daqVar3 = ((izp) obj3).b;
                ((qop) obj).getClass();
                actVar.getClass();
                rzq rzqVar2 = actVar.c;
                c8o.l(rzqVar2);
                q8n q8nVar = (q8n) daqVar3.w1.get();
                c8o.l(q8nVar);
                return new j061(rzqVar2, q8nVar);
            case 15:
                jbq jbqVar2 = (jbq) obj3;
                qop qopVar2 = (qop) obj;
                bct bctVar = (bct) obj2;
                daq daqVar4 = jbqVar2.a;
                teq teqVar3 = jbqVar2.b;
                qopVar2.getClass();
                bctVar.getClass();
                nfa0 nfa0Var = (nfa0) daqVar4.b2.get();
                c8o.l(nfa0Var);
                Context context2 = (Context) daqVar4.x1.a;
                c8o.l(context2);
                String strD2 = qopVar2.d();
                iac0 iac0VarC = qopVar2.c();
                koc0 koc0Var2 = bctVar.d;
                iyc0 iyc0Var = (iyc0) teqVar3.g1.get();
                c8o.l(iyc0Var);
                i8h1 i8h1Var2 = (i8h1) daqVar4.A5.get();
                c8o.l(i8h1Var2);
                m021 m021Var = new m021(i8h1Var2, bctVar.e);
                luk lukVar = (luk) daqVar4.L1.get();
                c8o.l(lukVar);
                xp4 xp4Var = new xp4(lukVar);
                kt91 kt91Var = (kt91) daqVar4.f8.get();
                c8o.l(kt91Var);
                lzn0 lzn0Var2 = (lzn0) teqVar3.i.get();
                c8o.l(lzn0Var2);
                zob1 zob1Var = bctVar.a;
                c8o.l(zob1Var);
                q8n q8nVar2 = (q8n) daqVar4.V2.get();
                c8o.l(q8nVar2);
                q8n q8nVar3 = (q8n) daqVar4.r2.get();
                c8o.l(q8nVar3);
                dc61 dc61Var = new dc61(nfa0Var, context2, strD2, iac0VarC, koc0Var2, iyc0Var, m021Var, xp4Var, kt91Var, lzn0Var2, zob1Var, q8nVar2, q8nVar3);
                luk lukVar2 = (luk) daqVar4.L1.get();
                c8o.l(lukVar2);
                yp4 yp4Var = new yp4(false, false, lukVar2);
                luk lukVar3 = (luk) daqVar4.L1.get();
                c8o.l(lukVar3);
                return new w4y0(dc61Var, new m021(yp4Var, new xp4(lukVar3), (byte) 27), koc0Var2, qopVar2.d());
            case 16:
                k3q k3qVar2 = (k3q) obj3;
                qop qopVar3 = (qop) obj;
                jbt jbtVar2 = (jbt) obj2;
                daq daqVar5 = k3qVar2.a;
                l3q l3qVar2 = new l3q(daqVar5, k3qVar2.b);
                qopVar3.getClass();
                jbtVar2.getClass();
                cp31 cp31Var = new cp31();
                cp31Var.a = jbtVar2;
                cp31Var.b = qopVar3;
                cp31Var.c = l3qVar2;
                cp31Var.d = iy81.a(new ipq(cp31Var, 0, (byte) 1));
                cp31Var.e = iy81.a(new ipq(cp31Var, 1, (byte) 1));
                cp31Var.f = iy81.a(new ipq(cp31Var, 2, (byte) 1));
                koc0 koc0Var3 = jbtVar2.d;
                u9c0 u9c0VarU = cp31Var.u();
                String strD3 = qopVar3.d();
                jpq jpqVar = (jpq) ((jly0) cp31Var.d).get();
                luk lukVar4 = (luk) daqVar5.L1.get();
                c8o.l(lukVar4);
                yp4 yp4Var2 = new yp4(false, false, lukVar4);
                luk lukVar5 = (luk) daqVar5.L1.get();
                c8o.l(lukVar5);
                m021 m021Var2 = new m021(yp4Var2, new xp4(lukVar5), (byte) 27);
                luk lukVar6 = (luk) daqVar5.L1.get();
                c8o.l(lukVar6);
                return new uc61(koc0Var3, u9c0VarU, strD3, jpqVar, m021Var2, new yp4(false, false, lukVar6), (kpq) ((jly0) cp31Var.e).get(), (lpq) ((jly0) cp31Var.f).get());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                jbq jbqVar3 = (jbq) obj3;
                qop qopVar4 = (qop) obj;
                jbt jbtVar3 = (jbt) obj2;
                daq daqVar6 = jbqVar3.a;
                k3q k3qVar3 = new k3q(daqVar6, jbqVar3.b);
                qopVar4.getClass();
                jbtVar3.getClass();
                jnq jnqVar = new jnq(k3qVar3, qopVar4, jbtVar3);
                koc0 koc0Var4 = jbtVar3.d;
                String strD4 = qopVar4.d();
                luk lukVar7 = (luk) daqVar6.L1.get();
                c8o.l(lukVar7);
                xx4 xx4Var = new xx4(false, false, lukVar7);
                luk lukVar8 = (luk) daqVar6.L1.get();
                c8o.l(lukVar8);
                yp4 yp4Var3 = new yp4(false, false, lukVar8);
                luk lukVar9 = (luk) daqVar6.L1.get();
                c8o.l(lukVar9);
                m021 m021Var3 = new m021(yp4Var3, new xp4(lukVar9), (byte) 27);
                luk lukVar10 = (luk) daqVar6.L1.get();
                c8o.l(lukVar10);
                d2f1 d2f1Var = new d2f1(xx4Var, m021Var3, new jq4(lukVar10));
                me30 me30Var = (me30) daqVar6.w7.get();
                c8o.l(me30Var);
                return new ncc0(koc0Var4, strD4, d2f1Var, me30Var, (bpq) jnqVar.d);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case 23:
            default:
                shv0 shv0Var = (shv0) obj;
                teq teqVar4 = ((yzp) obj3).a;
                shv0Var.getClass();
                ((rhv0) obj2).getClass();
                Intent intent = shv0Var.a;
                c8o.l(intent);
                String str = shv0Var.b;
                c8o.l(str);
                iyc0 iyc0Var2 = (iyc0) teqVar4.g1.get();
                c8o.l(iyc0Var2);
                return new bfe0(intent, str, iyc0Var2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                qop qopVar5 = (qop) obj;
                jbt jbtVar4 = (jbt) obj2;
                l0q l0qVar = new l0q(((mzp) obj3).a);
                qopVar5.getClass();
                jbtVar4.getClass();
                return new j2y0(jbtVar4.d, qopVar5.d(), (bpq) new jmq(l0qVar, qopVar5, jbtVar4).c);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                qop qopVar6 = (qop) obj;
                lbt lbtVar = (lbt) obj2;
                m0q m0qVar = new m0q(((w7q) obj3).a);
                qopVar6.getClass();
                lbtVar.getClass();
                return new zwr(lbtVar.b, qopVar6.d(), (bpq) new jmq(m0qVar, qopVar6, lbtVar).c);
            case 22:
                l3q l3qVar3 = (l3q) obj3;
                qop qopVar7 = (qop) obj;
                lbt lbtVar2 = (lbt) obj2;
                daq daqVar7 = l3qVar3.a;
                teq teqVar5 = l3qVar3.b;
                qopVar7.getClass();
                lbtVar2.getClass();
                koc0 koc0Var5 = lbtVar2.b;
                hd71 hd71Var = (hd71) teqVar5.h6.get();
                c8o.l(hd71Var);
                String strD5 = qopVar7.d();
                kls0 kls0Var = new kls0((xh71) teqVar5.N3.get(), teqVar5.q2());
                hod0 hod0Var = new hod0(teqVar5.B(), (byte) 21);
                luk lukVar11 = (luk) daqVar7.L1.get();
                c8o.l(lukVar11);
                return new k871(koc0Var5, hd71Var, strD5, kls0Var, hod0Var, new zp4(false, lukVar11));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                jbq jbqVar4 = (jbq) obj3;
                qop qopVar8 = (qop) obj;
                act actVar2 = (act) obj2;
                daq daqVar8 = jbqVar4.a;
                teq teqVar6 = jbqVar4.b;
                qopVar8.getClass();
                actVar2.getClass();
                hd71 hd71Var2 = (hd71) teqVar6.h6.get();
                c8o.l(hd71Var2);
                u9c0 u9c0VarQ = cto1.q(qopVar8.c());
                koc0 koc0Var6 = actVar2.f;
                hq41 hq41Var = (hq41) teqVar6.ug.get();
                c8o.l(hq41Var);
                q8n q8nVar4 = (q8n) daqVar8.w1.get();
                c8o.l(q8nVar4);
                return new af71(hd71Var2, u9c0VarQ, koc0Var6, hq41Var, q8nVar4);
        }
    }

    public void e(long j, izr0 izr0Var) {
        ijo1.q(j, izr0Var, ((gt51) this.b).c);
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        byte b2 = 18;
        Object obj = this.b;
        switch (b) {
            case 3:
                j421 j421Var = (j421) zf30Var;
                k421 k421Var = (k421) ((ynb0) ((uww0) obj).b).get();
                k421Var.getClass();
                j421Var.getClass();
                zzs zzsVar = (zzs) k421Var.a.get();
                c8o.l(zzsVar);
                j421Var.W1 = zzsVar;
                break;
            case 4:
                zj21 zj21Var = (zj21) zf30Var;
                ak21 ak21Var = (ak21) ((ynb0) ((uww0) obj).b).get();
                ak21Var.getClass();
                zj21Var.getClass();
                ik21 ik21Var = (ik21) ak21Var.a.get();
                c8o.l(ik21Var);
                zj21Var.X1 = ik21Var;
                break;
            case 5:
                im21 im21Var = (im21) zf30Var;
                jm21 jm21Var = (jm21) ((ynb0) ((uww0) obj).b).get();
                jm21Var.getClass();
                im21Var.getClass();
                ik21 ik21Var2 = (ik21) jm21Var.a.get();
                c8o.l(ik21Var2);
                im21Var.H1 = ik21Var2;
                break;
            case 9:
                mh41 mh41Var = (mh41) zf30Var;
                nh41 nh41Var = (nh41) ((ynb0) ((uww0) obj).b).get();
                nh41Var.getClass();
                mh41Var.getClass();
                gw70 gw70Var = (gw70) nh41Var.a.get();
                c8o.l(gw70Var);
                mh41Var.W1 = gw70Var;
                c8o.l((i8h1) nh41Var.b.get());
                break;
            case 10:
                SearchFragment searchFragment = (SearchFragment) zf30Var;
                l351 l351Var = (l351) ((ynb0) ((uww0) obj).b).get();
                l351Var.getClass();
                searchFragment.getClass();
                jnq jnqVar = new jnq(l351Var);
                caq caqVar = l351Var.h;
                i8h1 i8h1Var = (i8h1) caqVar.get();
                c8o.l(i8h1Var);
                searchFragment.G1 = new ffe1(i8h1Var, new bqk0((byte) 6), (byte) 18);
                iw4 iw4Var = (iw4) l351Var.f.get();
                c8o.l(iw4Var);
                searchFragment.H1 = iw4Var;
                gw70 gw70Var2 = (gw70) l351Var.g.get();
                c8o.l(gw70Var2);
                searchFragment.I1 = gw70Var2;
                i8h1 i8h1Var2 = (i8h1) caqVar.get();
                c8o.l(i8h1Var2);
                ffe1 ffe1Var = new ffe1(i8h1Var2, new bqk0((byte) 6), (byte) 18);
                g931 g931VarI = jnqVar.i();
                Scheduler scheduler = (Scheduler) l351Var.d.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) l351Var.c.get();
                c8o.l(scheduler2);
                searchFragment.J1 = new ld51(ffe1Var, g931VarI, scheduler, scheduler2);
                edr0 edr0Var = (edr0) l351Var.b.get();
                c8o.l(edr0Var);
                searchFragment.K1 = edr0Var;
                i8h1 i8h1Var3 = (i8h1) caqVar.get();
                c8o.l(i8h1Var3);
                searchFragment.L1 = i8h1Var3;
                l6h1 l6h1Var = (l6h1) l351Var.j.get();
                c8o.l(l6h1Var);
                searchFragment.M1 = l6h1Var;
                luk lukVar = (luk) l351Var.i.get();
                c8o.l(lukVar);
                searchFragment.N1 = new ul4(lukVar);
                searchFragment.O1 = (n8p) ((jly0) jnqVar.d).get();
                break;
            case 23:
                s871 s871Var = (s871) zf30Var;
                r871 r871Var = (r871) ((ynb0) ((uww0) obj).b).get();
                r871Var.getClass();
                s871Var.getClass();
                i8h1 i8h1Var4 = (i8h1) r871Var.a.get();
                c8o.l(i8h1Var4);
                s871Var.Z1 = i8h1Var4;
                break;
            case 25:
                k481 k481Var = (k481) zf30Var;
                l481 l481Var = (l481) ((sva) obj).b.get();
                l481Var.getClass();
                k481Var.getClass();
                hqq hqqVar = new hqq(l481Var, k481Var);
                k481Var.G1 = (s8v0) hqqVar.M.get();
                Map map = (Map) l481Var.a0.get();
                c8o.l(map);
                k481Var.H1 = new m481(map, j380.l(hga1.class, new uww0(xqu.a(hqqVar.N), b2)));
                a1r0 a1r0Var = (a1r0) l481Var.p1.get();
                c8o.l(a1r0Var);
                k481Var.I1 = a1r0Var;
                k481Var.J1 = (mae0) hqqVar.k.get();
                wnh1 wnh1Var = (wnh1) hqqVar.O.get();
                sg30 sg30Var = (sg30) l481Var.g1.get();
                c8o.l(sg30Var);
                k481Var.K1 = new r961(wnh1Var, sg30Var);
                break;
            case 26:
                uj81 uj81Var = (uj81) zf30Var;
                sj81 sj81Var = (sj81) ((ynb0) ((uww0) obj).b).get();
                sj81Var.getClass();
                uj81Var.getClass();
                a680 a680Var = new a680();
                a680Var.a = sj81Var;
                a680Var.b = uj81Var;
                a680Var.c = xqu.b(new ipq(a680Var, 1, (byte) 12));
                a680Var.d = xqu.b(new ipq(a680Var, 0, (byte) 12));
                a680Var.e = xqu.b(new ipq(a680Var, 3, (byte) 12));
                a680Var.f = xqu.b(new ipq(a680Var, 2, (byte) 12));
                gw70 gw70Var3 = (gw70) sj81Var.a.get();
                c8o.l(gw70Var3);
                uj81Var.G1 = gw70Var3;
                cd71 cd71Var = (cd71) sj81Var.c.get();
                c8o.l(cd71Var);
                uj81Var.H1 = cd71Var;
                kg0 kg0Var = (kg0) sj81Var.b.get();
                c8o.l(kg0Var);
                uj81Var.I1 = kg0Var;
                a1g a1gVar = (a1g) sj81Var.d.get();
                c8o.l(a1gVar);
                uj81Var.J1 = a1gVar;
                uur0 uur0Var = (uur0) sj81Var.e.get();
                c8o.l(uur0Var);
                uj81Var.K1 = uur0Var;
                uj81Var.L1 = (mir0) ((jly0) a680Var.d).get();
                z710 z710Var = (z710) sj81Var.g.get();
                c8o.l(z710Var);
                uj81Var.M1 = z710Var;
                uj81Var.N1 = (wj81) ((jly0) a680Var.f).get();
                break;
            case 27:
                kk81 kk81Var = (kk81) zf30Var;
                lk81 lk81Var = (lk81) ((ynb0) ((uww0) obj).b).get();
                lk81Var.getClass();
                kk81Var.getClass();
                goq goqVar = new goq(lk81Var, kk81Var);
                a031 a031Var = (a031) lk81Var.b.get();
                c8o.l(a031Var);
                kg0 kg0Var2 = (kg0) lk81Var.c.get();
                c8o.l(kg0Var2);
                w0g w0gVar = (w0g) lk81Var.e.get();
                c8o.l(w0gVar);
                a1g a1gVar2 = (a1g) lk81Var.d.get();
                c8o.l(a1gVar2);
                y441 y441Var = new y441(a031Var, kg0Var2, w0gVar, a1gVar2);
                q8n q8nVar = (q8n) lk81Var.a.get();
                c8o.l(q8nVar);
                kk81Var.G1 = new zj81(new ok81(new gk81(y441Var, q8nVar)));
                uur0 uur0Var2 = (uur0) lk81Var.f.get();
                c8o.l(uur0Var2);
                kk81Var.H1 = uur0Var2;
                gw70 gw70Var4 = (gw70) lk81Var.g.get();
                c8o.l(gw70Var4);
                kk81Var.I1 = gw70Var4;
                kk81Var.J1 = (mir0) ((jly0) goqVar.c).get();
                kk81Var.K1 = (mk81) ((jly0) goqVar.f).get();
                break;
            default:
                qk81 qk81Var = (qk81) zf30Var;
                rk81 rk81Var = (rk81) ((ynb0) ((uww0) obj).b).get();
                rk81Var.getClass();
                qk81Var.getClass();
                tjq tjqVar = new tjq(rk81Var, qk81Var);
                qk81Var.Z1 = (zxo) ((jly0) tjqVar.d).get();
                qk81Var.a2 = new ulc((byte) 18);
                qk81Var.b2 = (mir0) ((jly0) tjqVar.e).get();
                qk81Var.c2 = (b2r0) ((jly0) tjqVar.a).get();
                break;
        }
    }

    public void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                ((kl4) obj2).invoke(obj);
                break;
            default:
                ((k95) obj2).invoke(obj);
                break;
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        su5 su5Var = (su5) this.b;
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        try {
            oh61.a(j541.o(su5Var), builder);
            singleEmitter.onSuccess(builder.build());
        } catch (Exception e) {
            singleEmitter.onError(new IapException(e.getMessage(), "wamp.error"));
        }
    }

    public /* synthetic */ jf11(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
