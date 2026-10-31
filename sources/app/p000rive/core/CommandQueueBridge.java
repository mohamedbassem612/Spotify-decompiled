package app.p000rive.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bw\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001eJ'\u0010\"\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010\u001eJ'\u0010#\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u001eJ/\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b&\u0010\u001eJ/\u0010)\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b+\u0010*J'\u0010,\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b,\u0010\u001eJ'\u0010-\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J/\u00100\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'H&¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b2\u0010\u001eJ'\u00103\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010.J/\u00104\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'H&¢\u0006\u0004\b4\u00101J'\u00106\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H&¢\u0006\u0004\b6\u0010\u001eJ/\u00108\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0002H&¢\u0006\u0004\b8\u0010%J\u001f\u00109\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H&¢\u0006\u0004\b9\u0010:JG\u0010B\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020>H&¢\u0006\u0004\bB\u0010CJ/\u0010G\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020DH&¢\u0006\u0004\bG\u0010HJ'\u0010I\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010E\u001a\u00020DH&¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H&¢\u0006\u0004\bK\u0010:J'\u0010L\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\bL\u0010\u001eJ'\u0010M\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\bM\u0010\u001eJ'\u0010N\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\bN\u0010\u001eJ'\u0010O\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\bO\u0010\u001eJ'\u0010P\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\bP\u0010\u001eJ/\u0010Q\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\bQ\u00101J/\u0010R\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\bR\u0010SJ/\u0010T\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\bT\u00101J/\u0010U\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\bU\u0010SJ7\u0010W\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010V\u001a\u00020'H&¢\u0006\u0004\bW\u0010XJ7\u0010Y\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010V\u001a\u00020'H&¢\u0006\u0004\bY\u0010ZJ/\u0010]\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020'H&¢\u0006\u0004\b]\u00101J7\u0010_\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020'2\u0006\u0010^\u001a\u00020DH&¢\u0006\u0004\b_\u0010`J'\u0010a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u0002H&¢\u0006\u0004\ba\u0010\u001eJ'\u0010b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u0002H&¢\u0006\u0004\bb\u0010\u001eJ'\u0010c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u0002H&¢\u0006\u0004\bc\u0010\u001eJ/\u0010d\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u0002H&¢\u0006\u0004\bd\u0010%J'\u0010e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H&¢\u0006\u0004\be\u0010\u001eJ7\u0010f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'2\u0006\u0010[\u001a\u00020\u0002H&¢\u0006\u0004\bf\u0010gJ/\u0010h\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'H&¢\u0006\u0004\bh\u0010*J'\u0010i\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H&¢\u0006\u0004\bi\u0010\u001eJ/\u0010l\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010k\u001a\u00020>H&¢\u0006\u0004\bl\u0010mJ/\u0010n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'H&¢\u0006\u0004\bn\u0010*J/\u0010o\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010k\u001a\u00020'H&¢\u0006\u0004\bo\u0010pJ/\u0010q\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'H&¢\u0006\u0004\bq\u0010*J/\u0010r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010k\u001a\u00020\u0010H&¢\u0006\u0004\br\u0010sJ/\u0010t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'H&¢\u0006\u0004\bt\u0010*J/\u0010u\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010k\u001a\u00020'H&¢\u0006\u0004\bu\u0010pJ/\u0010v\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'H&¢\u0006\u0004\bv\u0010*J/\u0010w\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010k\u001a\u00020DH&¢\u0006\u0004\bw\u0010xJ/\u0010y\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'H&¢\u0006\u0004\by\u0010*J'\u0010z\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'H&¢\u0006\u0004\bz\u0010{J/\u0010}\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010|\u001a\u00020DH&¢\u0006\u0004\b}\u0010xJ/\u0010~\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010|\u001a\u00020DH&¢\u0006\u0004\b~\u0010xJ2\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010\u007f\u001a\u00020\u0002H&¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J3\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0007\u0010\u0082\u0001\u001a\u00020\u0002H&¢\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001J2\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0006\b\u0084\u0001\u0010\u0081\u0001J3\u0010\u0086\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0007\u0010\u0085\u0001\u001a\u00020\u0002H&¢\u0006\u0006\b\u0086\u0001\u0010\u0081\u0001J1\u0010\u0087\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'H&¢\u0006\u0005\b\u0087\u0001\u0010*J;\u0010\u0089\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010^\u001a\u00020D2\u0007\u0010\u0088\u0001\u001a\u00020\u0002H&¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J3\u0010\u008b\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0007\u0010\u0088\u0001\u001a\u00020\u0002H&¢\u0006\u0006\b\u008b\u0001\u0010\u0081\u0001J1\u0010\u008c\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0006\u0010^\u001a\u00020DH&¢\u0006\u0005\b\u008c\u0001\u0010xJ3\u0010\u008d\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0007\u0010\u0088\u0001\u001a\u00020\u0002H&¢\u0006\u0006\b\u008d\u0001\u0010\u0081\u0001J<\u0010\u0090\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00022\u0006\u0010j\u001a\u00020'2\u0007\u0010\u008e\u0001\u001a\u00020D2\u0007\u0010\u008f\u0001\u001a\u00020DH&¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J)\u0010\u0092\u0001\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0005\b\u0092\u0001\u0010\u001bJ!\u0010\u0093\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u007f\u001a\u00020\u0002H&¢\u0006\u0005\b\u0093\u0001\u0010:J*\u0010\u0094\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'2\u0006\u0010\u007f\u001a\u00020\u0002H&¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\"\u0010\u0096\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'H&¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J)\u0010\u0098\u0001\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0005\b\u0098\u0001\u0010\u001bJ\"\u0010\u009a\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0007\u0010\u0099\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b\u009a\u0001\u0010:J+\u0010\u009b\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'2\u0007\u0010\u0099\u0001\u001a\u00020\u0002H&¢\u0006\u0006\b\u009b\u0001\u0010\u0095\u0001J\"\u0010\u009c\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'H&¢\u0006\u0006\b\u009c\u0001\u0010\u0097\u0001J)\u0010\u009d\u0001\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0005\b\u009d\u0001\u0010\u001bJ\"\u0010\u009e\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0007\u0010\u0082\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b\u009e\u0001\u0010:J+\u0010\u009f\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'2\u0007\u0010\u0082\u0001\u001a\u00020\u0002H&¢\u0006\u0006\b\u009f\u0001\u0010\u0095\u0001J\"\u0010 \u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020'H&¢\u0006\u0006\b \u0001\u0010\u0097\u0001Jf\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0007\u0010¡\u0001\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020>2\u0007\u0010¢\u0001\u001a\u00020D2\u0007\u0010£\u0001\u001a\u00020>2\u0007\u0010¤\u0001\u001a\u00020>H&¢\u0006\u0006\b¥\u0001\u0010¦\u0001Jf\u0010§\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0007\u0010¡\u0001\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020>2\u0007\u0010¢\u0001\u001a\u00020D2\u0007\u0010£\u0001\u001a\u00020>2\u0007\u0010¤\u0001\u001a\u00020>H&¢\u0006\u0006\b§\u0001\u0010¦\u0001Jf\u0010¨\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0007\u0010¡\u0001\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020>2\u0007\u0010¢\u0001\u001a\u00020D2\u0007\u0010£\u0001\u001a\u00020>2\u0007\u0010¤\u0001\u001a\u00020>H&¢\u0006\u0006\b¨\u0001\u0010¦\u0001Jf\u0010©\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0007\u0010¡\u0001\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020>2\u0007\u0010¢\u0001\u001a\u00020D2\u0007\u0010£\u0001\u001a\u00020>2\u0007\u0010¤\u0001\u001a\u00020>H&¢\u0006\u0006\b©\u0001\u0010¦\u0001J<\u0010¬\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0007\u0010ª\u0001\u001a\u00020D2\u0007\u0010«\u0001\u001a\u00020D2\u0006\u0010?\u001a\u00020>H&¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J!\u0010®\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H&¢\u0006\u0005\b®\u0001\u0010:J3\u0010°\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0007\u0010¯\u0001\u001a\u00020>H&¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0019\u0010²\u0001\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0005\b²\u0001\u0010\u0005Jw\u0010¶\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010³\u0001\u001a\u00020\u00022\u0007\u0010´\u0001\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0007\u0010ª\u0001\u001a\u00020D2\u0007\u0010«\u0001\u001a\u00020D2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010?\u001a\u00020>2\u0007\u0010µ\u0001\u001a\u00020DH&¢\u0006\u0006\b¶\u0001\u0010·\u0001J\"\u0010¸\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0007\u0010´\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b¸\u0001\u0010:J\u0080\u0001\u0010º\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010³\u0001\u001a\u00020\u00022\u0007\u0010´\u0001\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0007\u0010ª\u0001\u001a\u00020D2\u0007\u0010«\u0001\u001a\u00020D2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010?\u001a\u00020>2\u0007\u0010µ\u0001\u001a\u00020D2\u0007\u0010¹\u0001\u001a\u00020\u0018H&¢\u0006\u0006\bº\u0001\u0010»\u0001J*\u0010¾\u0001\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u000e\u0010½\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¼\u0001H&¢\u0006\u0006\b¾\u0001\u0010¿\u0001¨\u0006À\u0001"}, d2 = {"Lapp/rive/core/CommandQueueBridge;", "", "", "renderContextPointer", "cppConstructor", "(J)J", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "Lapp/rive/core/CommandQueue;", "receiver", "Lapp/rive/core/Listeners;", "cppCreateListeners", "(JLapp/rive/core/CommandQueue;)Lapp/rive/core/Listeners;", "cppPollMessages", "", "enabled", "cppSetTracingEnabled", "(JZ)V", "cppSetDeferredEnabled", "isCurrentThreadCommandServer", "(J)Z", "requestID", "", "bytes", "cppLoadFile", "(JJ[B)J", "fileHandle", "cppDeleteFile", "(JJJ)V", "cppGetArtboardNames", "cppGetFileAssets", "artboardHandle", "cppGetStateMachineNames", "cppGetArtboardVolume", "cppGetDefaultViewModelInfo", "(JJJJ)V", "cppGetViewModelNames", "", "viewModelName", "cppGetViewModelInstanceNames", "(JJJLjava/lang/String;)V", "cppGetViewModelProperties", "cppGetEnums", "cppCreateDefaultArtboard", "(JJJ)J", "name", "cppCreateArtboardByName", "(JJJLjava/lang/String;)J", "cppDeleteArtboard", "cppCreateDefaultStateMachine", "cppCreateStateMachineByName", "stateMachineHandle", "cppDeleteStateMachine", "deltaTimeNs", "cppAdvanceStateMachine", "cppEnableSemantics", "(JJ)V", "", "fit", "alignment", "", "scaleFactor", "surfaceWidth", "surfaceHeight", "cppDrainSemanticsDiff", "(JJBBFFF)V", "", "semanticNodeID", "actionType", "cppFireSemanticAction", "(JJII)V", "cppRequestSemanticFocus", "(JJI)V", "cppClearSemanticFocus", "cppFocusNext", "cppFocusPrevious", "cppClearFocus", "cppRequestFocusState", "cppRequestHasFocusNodes", "cppNamedVMCreateBlankVMI", "cppDefaultVMCreateBlankVMI", "(JJJJ)J", "cppNamedVMCreateDefaultVMI", "cppDefaultVMCreateDefaultVMI", "instanceName", "cppNamedVMCreateNamedVMI", "(JJJLjava/lang/String;Ljava/lang/String;)J", "cppDefaultVMCreateNamedVMI", "(JJJJLjava/lang/String;)J", "viewModelInstanceHandle", "path", "cppReferenceNestedVMI", "index", "cppReferenceListItemVMI", "(JJJLjava/lang/String;I)J", "cppGetViewModelInstanceViewModelName", "cppGetViewModelInstanceName", "cppDeleteViewModelInstance", "cppSetMainViewModelInstance", "cppClearMainViewModelInstance", "cppSetGlobalViewModelInstance", "(JJJLjava/lang/String;J)V", "cppClearGlobalViewModelInstance", "cppBind", "propertyPath", "value", "cppSetNumberProperty", "(JJLjava/lang/String;F)V", "cppGetNumberProperty", "cppSetStringProperty", "(JJLjava/lang/String;Ljava/lang/String;)V", "cppGetStringProperty", "cppSetBooleanProperty", "(JJLjava/lang/String;Z)V", "cppGetBooleanProperty", "cppSetEnumProperty", "cppGetEnumProperty", "cppSetColorProperty", "(JJLjava/lang/String;I)V", "cppGetColorProperty", "cppFireTriggerProperty", "(JJLjava/lang/String;)V", "propertyType", "cppSubscribeToProperty", "cppUnsubscribeFromProperty", "imageHandle", "cppSetImageProperty", "(JJLjava/lang/String;J)V", "fontHandle", "cppSetFontProperty", "cppSetArtboardProperty", "valueHandle", "cppSetViewModelInstanceProperty", "cppGetListSize", "itemHandle", "cppInsertToListAtIndex", "(JJLjava/lang/String;IJ)V", "cppAppendToList", "cppRemoveFromListAtIndex", "cppRemoveFromList", "indexA", "indexB", "cppSwapListItems", "(JJLjava/lang/String;II)V", "cppDecodeImage", "cppDeleteImage", "cppRegisterImage", "(JLjava/lang/String;J)V", "cppUnregisterImage", "(JLjava/lang/String;)V", "cppDecodeAudio", "audioHandle", "cppDeleteAudio", "cppRegisterAudio", "cppUnregisterAudio", "cppDecodeFont", "cppDeleteFont", "cppRegisterFont", "cppUnregisterFont", "layoutScale", "pointerID", "x", "y", "cppPointerMove", "(JJBBFFFIFF)V", "cppPointerDown", "cppPointerUp", "cppPointerExit", "width", "height", "cppResizeArtboard", "(JJIIF)V", "cppResetArtboardSize", "volume", "cppSetArtboardVolume", "(JJJF)V", "cppCreateDrawKey", "surfaceNativePointer", "drawKey", "clearColor", "cppDraw", "(JJJJJJIIBBFI)V", "cppCancelDraw", "buffer", "cppDrawToBuffer", "(JJJJJJIIBBFI[B)V", "Lkotlin/Function0;", "work", "cppRunOnCommandServer", "(JLkotlin/jvm/functions/Function0;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CommandQueueBridge {
    void cppAdvanceStateMachine(long pointer, long requestID, long stateMachineHandle, long deltaTimeNs);

    void cppAppendToList(long pointer, long viewModelInstanceHandle, String propertyPath, long itemHandle);

    void cppBind(long pointer, long requestID, long stateMachineHandle);

    void cppCancelDraw(long pointer, long drawKey);

    void cppClearFocus(long pointer, long stateMachineHandle, long requestID);

    void cppClearGlobalViewModelInstance(long pointer, long requestID, long stateMachineHandle, String name);

    void cppClearMainViewModelInstance(long pointer, long requestID, long stateMachineHandle);

    void cppClearSemanticFocus(long pointer, long stateMachineHandle);

    long cppConstructor(long renderContextPointer);

    long cppCreateArtboardByName(long pointer, long requestID, long fileHandle, String name);

    long cppCreateDefaultArtboard(long pointer, long requestID, long fileHandle);

    long cppCreateDefaultStateMachine(long pointer, long requestID, long artboardHandle);

    long cppCreateDrawKey(long pointer);

    Listeners cppCreateListeners(long pointer, CommandQueue receiver);

    long cppCreateStateMachineByName(long pointer, long requestID, long artboardHandle, String name);

    long cppDecodeAudio(long pointer, long requestID, byte[] bytes);

    long cppDecodeFont(long pointer, long requestID, byte[] bytes);

    long cppDecodeImage(long pointer, long requestID, byte[] bytes);

    long cppDefaultVMCreateBlankVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    long cppDefaultVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, long artboardHandle);

    long cppDefaultVMCreateNamedVMI(long pointer, long requestID, long fileHandle, long artboardHandle, String instanceName);

    void cppDelete(long pointer);

    void cppDeleteArtboard(long pointer, long requestID, long artboardHandle);

    void cppDeleteAudio(long pointer, long audioHandle);

    void cppDeleteFile(long pointer, long requestID, long fileHandle);

    void cppDeleteFont(long pointer, long fontHandle);

    void cppDeleteImage(long pointer, long imageHandle);

    void cppDeleteStateMachine(long pointer, long requestID, long stateMachineHandle);

    void cppDeleteViewModelInstance(long pointer, long requestID, long viewModelInstanceHandle);

    void cppDrainSemanticsDiff(long pointer, long stateMachineHandle, byte fit, byte alignment, float scaleFactor, float surfaceWidth, float surfaceHeight);

    void cppDraw(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor);

    void cppDrawToBuffer(long pointer, long renderContextPointer, long surfaceNativePointer, long drawKey, long artboardHandle, long stateMachineHandle, int width, int height, byte fit, byte alignment, float scaleFactor, int clearColor, byte[] buffer);

    void cppEnableSemantics(long pointer, long stateMachineHandle);

    void cppFireSemanticAction(long pointer, long stateMachineHandle, int semanticNodeID, int actionType);

    void cppFireTriggerProperty(long pointer, long viewModelInstanceHandle, String propertyPath);

    void cppFocusNext(long pointer, long stateMachineHandle, long requestID);

    void cppFocusPrevious(long pointer, long stateMachineHandle, long requestID);

    void cppGetArtboardNames(long pointer, long requestID, long fileHandle);

    void cppGetArtboardVolume(long pointer, long requestID, long artboardHandle);

    void cppGetBooleanProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    void cppGetColorProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    void cppGetDefaultViewModelInfo(long pointer, long requestID, long fileHandle, long artboardHandle);

    void cppGetEnumProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    void cppGetEnums(long pointer, long requestID, long fileHandle);

    void cppGetFileAssets(long pointer, long requestID, long fileHandle);

    void cppGetListSize(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    void cppGetNumberProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    void cppGetStateMachineNames(long pointer, long requestID, long artboardHandle);

    void cppGetStringProperty(long pointer, long requestID, long viewModelInstanceHandle, String propertyPath);

    void cppGetViewModelInstanceName(long pointer, long requestID, long viewModelInstanceHandle);

    void cppGetViewModelInstanceNames(long pointer, long requestID, long fileHandle, String viewModelName);

    void cppGetViewModelInstanceViewModelName(long pointer, long requestID, long viewModelInstanceHandle);

    void cppGetViewModelNames(long pointer, long requestID, long fileHandle);

    void cppGetViewModelProperties(long pointer, long requestID, long fileHandle, String viewModelName);

    void cppInsertToListAtIndex(long pointer, long viewModelInstanceHandle, String propertyPath, int index, long itemHandle);

    long cppLoadFile(long pointer, long requestID, byte[] bytes);

    long cppNamedVMCreateBlankVMI(long pointer, long requestID, long fileHandle, String viewModelName);

    long cppNamedVMCreateDefaultVMI(long pointer, long requestID, long fileHandle, String viewModelName);

    long cppNamedVMCreateNamedVMI(long pointer, long requestID, long fileHandle, String viewModelName, String instanceName);

    void cppPointerDown(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    void cppPointerExit(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    void cppPointerMove(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    void cppPointerUp(long pointer, long stateMachineHandle, byte fit, byte alignment, float layoutScale, float surfaceWidth, float surfaceHeight, int pointerID, float x, float y);

    void cppPollMessages(long pointer);

    long cppReferenceListItemVMI(long pointer, long requestID, long viewModelInstanceHandle, String path, int index);

    long cppReferenceNestedVMI(long pointer, long requestID, long viewModelInstanceHandle, String path);

    void cppRegisterAudio(long pointer, String name, long audioHandle);

    void cppRegisterFont(long pointer, String name, long fontHandle);

    void cppRegisterImage(long pointer, String name, long imageHandle);

    void cppRemoveFromList(long pointer, long viewModelInstanceHandle, String propertyPath, long itemHandle);

    void cppRemoveFromListAtIndex(long pointer, long viewModelInstanceHandle, String propertyPath, int index);

    void cppRequestFocusState(long pointer, long stateMachineHandle, long requestID);

    void cppRequestHasFocusNodes(long pointer, long stateMachineHandle, long requestID);

    void cppRequestSemanticFocus(long pointer, long stateMachineHandle, int semanticNodeID);

    void cppResetArtboardSize(long pointer, long artboardHandle);

    void cppResizeArtboard(long pointer, long artboardHandle, int width, int height, float scaleFactor);

    void cppRunOnCommandServer(long pointer, Function0 work);

    void cppSetArtboardProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long artboardHandle);

    void cppSetArtboardVolume(long pointer, long requestID, long artboardHandle, float volume);

    void cppSetBooleanProperty(long pointer, long viewModelInstanceHandle, String propertyPath, boolean value);

    void cppSetColorProperty(long pointer, long viewModelInstanceHandle, String propertyPath, int value);

    void cppSetDeferredEnabled(long pointer, boolean enabled);

    void cppSetEnumProperty(long pointer, long viewModelInstanceHandle, String propertyPath, String value);

    void cppSetFontProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long fontHandle);

    void cppSetGlobalViewModelInstance(long pointer, long requestID, long stateMachineHandle, String name, long viewModelInstanceHandle);

    void cppSetImageProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long imageHandle);

    void cppSetMainViewModelInstance(long pointer, long requestID, long stateMachineHandle, long viewModelInstanceHandle);

    void cppSetNumberProperty(long pointer, long viewModelInstanceHandle, String propertyPath, float value);

    void cppSetStringProperty(long pointer, long viewModelInstanceHandle, String propertyPath, String value);

    void cppSetTracingEnabled(long pointer, boolean enabled);

    void cppSetViewModelInstanceProperty(long pointer, long viewModelInstanceHandle, String propertyPath, long valueHandle);

    void cppSubscribeToProperty(long pointer, long viewModelInstanceHandle, String propertyPath, int propertyType);

    void cppSwapListItems(long pointer, long viewModelInstanceHandle, String propertyPath, int indexA, int indexB);

    void cppUnregisterAudio(long pointer, String name);

    void cppUnregisterFont(long pointer, String name);

    void cppUnregisterImage(long pointer, String name);

    void cppUnsubscribeFromProperty(long pointer, long viewModelInstanceHandle, String propertyPath, int propertyType);

    boolean isCurrentThreadCommandServer(long pointer);
}
